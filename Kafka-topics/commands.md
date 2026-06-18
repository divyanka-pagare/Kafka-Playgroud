PS C:\kafka> bin\windows\kafka-topics.bat `
>> --create `
>> --topic orders `
>> --bootstrap-server localhost:9092 `
>> --partitions 3 `
>> --replication-factor 1
2026-06-18T11:49:16.922856400Z main ERROR Reconfiguration failed: No configuration found for '764c12b6' at 'null' in 'null'
Created topic orders.
PS C:\kafka> bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
2026-06-18T11:49:28.484432200Z main ERROR Reconfiguration failed: No configuration found for '764c12b6' at 'null' in 'null'
orders
PS C:\kafka> bin\windows\kafka-topics.bat `
>> --describe `
>> --topic orders `
>> --bootstrap-server localhost:9092
2026-06-18T11:51:30.460937500Z main ERROR Reconfiguration failed: No configuration found for '764c12b6' at 'null' in 'null'
Topic: orders   TopicId: 8v9E815sQsO_kdkxkJTkIg PartitionCount: 3       ReplicationFactor: 1    Configs: min.insync.replicas=1,segment.bytes=1073741824
        Topic: orders   Partition: 0    Leader: 2       Replicas: 2     Isr: 2  Elr:    LastKnownElr:
        Topic: orders   Partition: 1    Leader: 2       Replicas: 2     Isr: 2  Elr:    LastKnownElr:
        Topic: orders   Partition: 2    Leader: 2       Replicas: 2     Isr: 2  Elr:    LastKnownElr:
PS C:\kafka>