#查看正在任务列表

获取所有运行任务（只能看到自己的），可以通过load语法

```sql
load _mlsql_.`jobs` as output;
```

显示结果如下：

```
owner                   jobType jobName                                 jobContent                      groupId                  startTime       timeout
----------------------------------------------------------------------------------------------------
allwefantasy@gmail.com	script	2595b404-c54c-436a-9cb7-ccd33438bc36	load _mlsql_.`jobs` as output;	23	                     1547194894263	-1
```

