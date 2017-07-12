--做一个触发器,当除了Admin外,设置权限的时候都会变为自己和下属,Admin可以查看全部

Create Trigger xianZhiGuanLiYuanKanShangJi1	----当更新非0001的时候让该用户无法更新为查看全部
On Hion_Duty2015
after update
As
declare @Recid int
declare @QXValue nvarchar(40)
Select @Recid=Recid from inserted
  Select @QXValue=QXValue from inserted
begin
     if(@QXValue='全部')
	 begin
	  update Hion_Duty2015 set 	QXValue='自己及下属'	where Recid=@Recid	and   StaffName <>'初始值' and   StaffName<>(select StaffName from Hion_AgentInfo where StaffID=0001)
	 end
end
 ---把模板改为  只能查看本人和下属,增加员工的模板就这样定了
  update Hion_Duty2015 set 	QXValue='自己及下属' where StaffName='初始值' and   QXValue='全部'

----------让下属成员只能在0001添加
 ---把模板改为  不能添加下属
  update Hion_Duty2015 set 	QXValue='NO' where StaffName='初始值' and   QX2='下属成员'


  
  Create Trigger xianZhiGuanLiYuanTianJiaXiaShu	----当更新非0001的时候让该用户无法添加下属
On Hion_Duty2015
after update
As
declare @Recid int
declare @QXValue nvarchar(40)
Select @Recid=Recid from inserted
  Select @QXValue=QXValue from inserted
begin
     if(@QXValue='Y')
	 begin
	  update Hion_Duty2015 set 	QXValue='NO'	where Recid=@Recid	and  QX2='下属成员'	and   StaffName<>(select StaffName from Hion_AgentInfo where StaffID=0001)
	 end
end