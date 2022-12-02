一、RDD
  
    定义: 已被分区、被序列化、不可变的、有容错机制的、能被并行操作的数据集合。Spark基本计算单元，是Spark最核心的东西

二、SparkConf
    
    spark配置相关。可设置appName - 应用程序名称，master-运行模式

三、Master - 运行模式介绍

    1、local - 单节点模式，一般用来进行开发和学些
    2、Standalone - 集群模式，独立模式，类似MapReduce 1.0所采取的模式，完全由内部实现容错性和资源管理
    3、Spark on Yarn - 两种模式集群模式：Yarn Client 与 Yarn Cluster
       3.1 Yarn Client：适用于交互与调试（应用较多）
           交互：提供一个终端进行个调试->反馈一个结果（实时）
           让Spark运行在一个通用的资源管理系统之上，这样可以与其他计算框架共享资源
       3.2 Yarn Cluster:(集群)适用于生产环境（公司应用较多）
       有哪些信息要输出要反馈都是输出到log日志文件中，只能查看log（后知后觉）
   
四、缓存数据级别
    
    1、memory_only  - 仅仅使用内存进行缓存
    2、memory_and_disk - 使用内存 + 磁盘进行缓存
    3、disk_only - 仅仅使用磁盘进行缓存
