```
PS C:\Users\dell> cd C:\kafka
PS C:\kafka>
PS C:\kafka> bin\windows\kafka-console-consumer.bat `
>> --topic orders `
>> --from-beginning `
>> --bootstrap-server localhost:9092
2026-06-18T12:00:31.116521600Z main ERROR Reconfiguration failed: No configuration found for '764c12b6' at 'null' in 'null'
The consumer rebalance protocol (KIP-848) is production-ready! Set group.protocol=consumer to try it out. See https://kafka.apache.org/documentation/#consumer_rebalance_protocol
Order Created: 101
Order Created: 102
Order Created: 103
Order-1
Order-2
Order-3
Order-4
Order-5

```
