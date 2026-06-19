```
PS C:\Users\dell> cd C:\Kafka
PS C:\Kafka> bin\windows\kafka-server-start.bat config\controller.properties
DEPRECATED: A Log4j 1.x configuration file has been detected, which is no longer recommended.
To use a Log4j 2.x configuration, please see https://logging.apache.org/log4j/2.x/migrate-from-log4j1.html#Log4j2ConfigurationFormat for details about Log4j configuration file migration.
You can also use the C:\kafka/config/tool-log4j2.yaml file as a starting point. Make sure to remove the Log4j 1.x configuration after completing the migration.
[2026-06-18 16:50:14,844] INFO Registered `kafka:type=kafka.Log4jController` MBean (kafka.utils.Log4jControllerRegistration$)
[2026-06-18 16:50:15,115] ERROR Exiting Kafka due to fatal exception (kafka.Kafka$)
java.lang.RuntimeException: No readable meta.properties files found.
        at org.apache.kafka.metadata.properties.MetaPropertiesEnsemble.verify(MetaPropertiesEnsemble.java:480)
        at kafka.server.KafkaRaftServer$.initializeLogDirs(KafkaRaftServer.scala:140)
        at kafka.server.KafkaRaftServer.<init>(KafkaRaftServer.scala:55)
        at kafka.Kafka$.buildServer(Kafka.scala:68)
        at kafka.Kafka$.main(Kafka.scala:75)
        at kafka.Kafka.main(Kafka.scala)
PS C:\Kafka> bin\windows\kafka-storage.bat format -t SPB5Ru5bTcu7suX_1Z_llA -c config\controller.properties
2026-06-18T11:20:49.925527200Z main ERROR Reconfiguration failed: No configuration found for '764c12b6' at 'null' in 'null'
Because controller.quorum.voters is not set on this controller, you must specify one of the following: --standalone, --initial-controllers, or --no-initial-controllers.
PS C:\Kafka> Get-Content config\controller.properties
# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

############################# Server Basics #############################

# The role of this server. Setting this puts us in KRaft mode
process.roles=controller

# The node id associated with this instance's roles
node.id=1

# Information about the KRaft controller quorum.
# Uncomment controller.quorum.voters to use a static controller quorum.
#controller.quorum.voters=1@localhost:9093
controller.quorum.bootstrap.servers=localhost:9093

############################# Socket Server Settings #############################

# The address the socket server listens on.
# Note that only the controller listeners are allowed here when `process.roles=controller`
#   FORMAT:
#     listeners = listener_name://host_name:port
#   EXAMPLE:
#     listeners = PLAINTEXT://your.host.name:9092
listeners=CONTROLLER://:9093

# Listener name, hostname and port the controller will advertise to admin clients, broker nodes and controller nodes.
# Note that the only controller listeners are allowed here when `process.roles=controller`.
# If not set, it uses the value for "listeners".
advertised.listeners=CONTROLLER://localhost:9093

# A comma-separated list of the names of the listeners used by the controller.
# This is required if running in KRaft mode.
controller.listener.names=CONTROLLER

# Maps listener names to security protocols, the default is for them to be the same. See the config documentation for more details
#listener.security.protocol.map=PLAINTEXT:PLAINTEXT,SSL:SSL,SASL_PLAINTEXT:SASL_PLAINTEXT,SASL_SSL:SASL_SSL

# The number of threads that the server uses for receiving requests from the network and sending responses to the network
num.network.threads=3

# The number of threads that the server uses for processing requests, which may include disk I/O
num.io.threads=8

# The send buffer (SO_SNDBUF) used by the socket server
socket.send.buffer.bytes=102400

# The receive buffer (SO_RCVBUF) used by the socket server
socket.receive.buffer.bytes=102400

# The maximum size of a request that the socket server will accept (protection against OOM)
socket.request.max.bytes=104857600


############################# Log Basics #############################

# A comma separated list of directories under which to store log files
log.dirs=/tmp/kraft-controller-logs

# The default number of log partitions per topic. More partitions allow greater
# parallelism for consumption, but this will also result in more files across
# the brokers.
num.partitions=1

# The number of threads per data directory to be used for log recovery at startup and flushing at shutdown.
# This value is recommended to be increased based on the installation resources.
num.recovery.threads.per.data.dir=2

############################# Internal Topic Settings  #############################
# The replication factor for the group metadata internal topics "__consumer_offsets" and "__transaction_state"
# For anything other than development testing, a value greater than 1 is recommended to ensure availability such as 3.
offsets.topic.replication.factor=1
transaction.state.log.replication.factor=1
transaction.state.log.min.isr=1

# Share state topic settings
share.coordinator.state.topic.replication.factor=1
share.coordinator.state.topic.min.isr=1

############################# Log Flush Policy #############################

# Messages are immediately written to the filesystem but by default we only fsync() to sync
# the OS cache lazily. The following configurations control the flush of data to disk.
# There are a few important trade-offs here:
#    1. Durability: Unflushed data may be lost if you are not using replication.
#    2. Latency: Very large flush intervals may lead to latency spikes when the flush does occur as there will be a lot of data to flush.
#    3. Throughput: The flush is generally the most expensive operation, and a small flush interval may lead to excessive seeks.
# The settings below allow one to configure the flush policy to flush data after a period of time or
# every N messages (or both). This can be done globally and overridden on a per-topic basis.

# The number of messages to accept before forcing a flush of data to disk
#log.flush.interval.messages=10000

# The maximum amount of time a message can sit in a log before we force a flush
#log.flush.interval.ms=1000

############################# Log Retention Policy #############################

# The following configurations control the disposal of log segments. The policy can
# be set to delete segments after a period of time, or after a given size has accumulated.
# A segment will be deleted whenever *either* of these criteria are met. Deletion always happens
# from the end of the log.

# The minimum age of a log file to be eligible for deletion due to age
log.retention.hours=168

# A size-based retention policy for logs. Segments are pruned from the log unless the remaining
# segments drop below log.retention.bytes. Functions independently of log.retention.hours.
#log.retention.bytes=1073741824

# The maximum size of a log segment file. When this size is reached a new log segment will be created.
log.segment.bytes=1073741824

# The interval at which log segments are checked to see if they can be deleted according
# to the retention policies
log.retention.check.interval.ms=300000
PS C:\Kafka> notepad C:\Kafka\config\controller.properties
PS C:\Kafka> Select-String "controller.quorum.voters" config\controller.properties

config\controller.properties:25:# Uncomment controller.quorum.voters to use a static controller quorum.
config\controller.properties:26:controller.quorum.voters=1@localhost:9093


PS C:\Kafka> bin\windows\kafka-storage.bat format -t SPB5Ru5bTcu7suX_1Z_llA -c config\controller.properties
2026-06-18T11:26:30.673289800Z main ERROR Reconfiguration failed: No configuration found for '764c12b6' at 'null' in 'null'
Bootstrap metadata: BootstrapMetadata(records=[ApiMessageAndVersion(FeatureLevelRecord(name='metadata.version', featureLevel=30) at version 0), ApiMessageAndVersion(FeatureLevelRecord(name='eligible.leader.replicas.version', featureLevel=1) at version 0), ApiMessageAndVersion(FeatureLevelRecord(name='group.version', featureLevel=1) at version 0), ApiMessageAndVersion(FeatureLevelRecord(name='share.version', featureLevel=1) at version 0), ApiMessageAndVersion(FeatureLevelRecord(name='streams.version', featureLevel=1) at version 0), ApiMessageAndVersion(FeatureLevelRecord(name='transaction.version', featureLevel=2) at version 0)], metadataVersionLevel=30, source=format command)
Formatting metadata directory /tmp/kraft-controller-logs with metadata.version 4.3-IV0.
PS C:\Kafka>

```