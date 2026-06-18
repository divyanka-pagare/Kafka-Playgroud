PS C:\Users\dell> cd c:\kafka
PS C:\kafka> bin\windows\kafka-server-start.bat config\broker.properties
DEPRECATED: A Log4j 1.x configuration file has been detected, which is no longer recommended.
To use a Log4j 2.x configuration, please see https://logging.apache.org/log4j/2.x/migrate-from-log4j1.html#Log4j2ConfigurationFormat for details about Log4j configuration file migration.
You can also use the C:\kafka/config/tool-log4j2.yaml file as a starting point. Make sure to remove the Log4j 1.x configuration after completing the migration.
[2026-06-18 17:14:02,979] INFO Registered `kafka:type=kafka.Log4jController` MBean (kafka.utils.Log4jControllerRegistration$)
[2026-06-18 17:14:03,197] WARN num.partitions is defined in the broker role. This configuration will be ignored in 5.0. Please set num.partitions in the controller role instead. (kafka.server.KafkaConfig)
[2026-06-18 17:14:03,297] WARN num.partitions is defined in the broker role. This configuration will be ignored in 5.0. Please set num.partitions in the controller role instead. (kafka.server.KafkaConfig)
[2026-06-18 17:14:03,303] WARN num.partitions is defined in the broker role. This configuration will be ignored in 5.0. Please set num.partitions in the controller role instead. (kafka.server.KafkaConfig)
[2026-06-18 17:14:03,339] INFO [BrokerServer id=2] Transition from SHUTDOWN to STARTING (kafka.server.BrokerServer)
[2026-06-18 17:14:03,342] INFO [SharedServer id=2] Starting SharedServer (kafka.server.SharedServer)
[2026-06-18 17:14:03,348] WARN num.partitions is defined in the broker role. This configuration will be ignored in 5.0. Please set num.partitions in the controller role instead. (kafka.server.KafkaConfig)
[2026-06-18 17:14:03,422] INFO [LogLoader partition=__cluster_metadata-0, dir=C:\tmp\kraft-broker-logs] Recovering unflushed segment 0. 0 recovered for __cluster_metadata-0. (org.apache.kafka.storage.internals.log.LogLoader)
[2026-06-18 17:14:03,424] INFO [LogLoader partition=__cluster_metadata-0, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:14:03,425] INFO [LogLoader partition=__cluster_metadata-0, dir=C:\tmp\kraft-broker-logs] Reloading from producer snapshot and rebuilding producer state from offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:14:03,426] INFO Deleted producer state snapshot C:\tmp\kraft-broker-logs\__cluster_metadata-0\00000000000000000259.snapshot (org.apache.kafka.storage.internals.log.SnapshotFile)
[2026-06-18 17:14:03,427] INFO [LogLoader partition=__cluster_metadata-0, dir=C:\tmp\kraft-broker-logs] Producer state recovery took 2ms for snapshot load and 0ms for segment recovery from offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::invokeCleaner has been called by org.apache.kafka.common.utils.ByteBufferUnmapper (file:/C:/kafka/libs/kafka-clients-4.3.0.jar)
WARNING: Please consider reporting this to the maintainers of class org.apache.kafka.common.utils.ByteBufferUnmapper
WARNING: sun.misc.Unsafe::invokeCleaner will be removed in a future release
[2026-06-18 17:14:03,492] INFO [ProducerStateManager partition=__cluster_metadata-0] Wrote producer snapshot at offset 259 with 0 producer ids in 6 ms. (org.apache.kafka.storage.internals.log.ProducerStateManager)
[2026-06-18 17:14:03,508] INFO [LogLoader partition=__cluster_metadata-0, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 259 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:14:03,509] INFO [LogLoader partition=__cluster_metadata-0, dir=C:\tmp\kraft-broker-logs] Reloading from producer snapshot and rebuilding producer state from offset 259 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:14:03,511] INFO [ProducerStateManager partition=__cluster_metadata-0] Loading producer state from snapshot file 'SnapshotFile(offset=259, file=C:\tmp\kraft-broker-logs\__cluster_metadata-0\00000000000000000259.snapshot)' (org.apache.kafka.storage.internals.log.ProducerStateManager)
[2026-06-18 17:14:03,517] INFO [LogLoader partition=__cluster_metadata-0, dir=C:\tmp\kraft-broker-logs] Producer state recovery took 7ms for snapshot load and 0ms for segment recovery from offset 259 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:14:03,534] INFO [RaftLog partition=__cluster_metadata-0] Initialized snapshots with IDs [] from C:\tmp\kraft-broker-logs\__cluster_metadata-0 (org.apache.kafka.raft.internals.KafkaRaftLog)
[2026-06-18 17:14:03,606] INFO [raft-expiration-reaper]: Starting (org.apache.kafka.raft.TimingWheelExpirationService$ExpiredOperationReaper)
[2026-06-18 17:14:03,616] INFO [RaftManager id=2] Starting request manager with bootstrap servers: [localhost:9093 (id: -2 rack: null isFenced: false)] (org.apache.kafka.raft.KafkaRaftClient)
[2026-06-18 17:14:03,626] INFO [RaftManager id=2] Reading KRaft snapshot and log as part of the initialization (org.apache.kafka.raft.KafkaRaftClient)
[2026-06-18 17:14:03,651] INFO [RaftManager id=2] Starting voters are VoterSet(voters={1=VoterNode(voterKey=ReplicaKey(id=1, directoryId=<undefined>), listeners=Endpoints(endpoints={ListenerName(CONTROLLER)=localhost/<unresolved>:9093}), supportedKRaftVersion=SupportedVersionRange[min_version:0, max_version:0])}) (org.apache.kafka.raft.KafkaRaftClient)
[2026-06-18 17:14:03,666] INFO [RaftManager id=2] Attempting durable transition to FollowerState(fetchTimeoutMs=2000, epoch=1, leader=1, leaderEndpoints=Endpoints(endpoints={ListenerName(CONTROLLER)=localhost/<unresolved>:9093}), votedKey=Optional.empty, voters=[1], highWatermark=Optional.empty, fetchingSnapshot=Optional.empty) from null (org.apache.kafka.raft.QuorumState)
[2026-06-18 17:14:03,688] INFO [RaftManager id=2] Completed transition to FollowerState(fetchTimeoutMs=2000, epoch=1, leader=1, leaderEndpoints=Endpoints(endpoints={ListenerName(CONTROLLER)=localhost/<unresolved>:9093}), votedKey=Optional.empty, voters=[1], highWatermark=Optional.empty, fetchingSnapshot=Optional.empty) from null (org.apache.kafka.raft.QuorumState)
[2026-06-18 17:14:03,763] INFO [kafka-2-raft-io-thread]: Starting (org.apache.kafka.raft.KafkaRaftClientDriver)
[2026-06-18 17:14:03,763] INFO [kafka-2-raft-outbound-request-thread]: Starting (org.apache.kafka.raft.KafkaNetworkChannel$SendThread)
[2026-06-18 17:14:03,813] INFO [MetadataLoader id=2] initializeNewPublishers: the loader is still catching up because we still don't know the high water mark yet. (org.apache.kafka.image.loader.MetadataLoader)
[2026-06-18 17:14:03,815] INFO [BrokerServer id=2] Starting broker (kafka.server.BrokerServer)
[2026-06-18 17:14:03,826] WARN num.partitions is defined in the broker role. This configuration will be ignored in 5.0. Please set num.partitions in the controller role instead. (kafka.server.KafkaConfig)
[2026-06-18 17:14:03,840] INFO [broker-2-ThrottledChannelReaper-Fetch]: Starting (org.apache.kafka.server.quota.ClientQuotaManager$ThrottledChannelReaper)
[2026-06-18 17:14:03,842] INFO [broker-2-ThrottledChannelReaper-Produce]: Starting (org.apache.kafka.server.quota.ClientQuotaManager$ThrottledChannelReaper)
[2026-06-18 17:14:03,843] INFO [broker-2-ThrottledChannelReaper-Request]: Starting (org.apache.kafka.server.quota.ClientQuotaManager$ThrottledChannelReaper)
[2026-06-18 17:14:03,846] INFO [broker-2-ThrottledChannelReaper-ControllerMutation]: Starting (org.apache.kafka.server.quota.ClientQuotaManager$ThrottledChannelReaper)
[2026-06-18 17:14:03,905] INFO [BrokerServer id=2] Waiting for controller quorum voters future (kafka.server.BrokerServer)
[2026-06-18 17:14:03,906] INFO [BrokerServer id=2] Finished waiting for controller quorum voters future (kafka.server.BrokerServer)
[2026-06-18 17:14:03,916] INFO [MetadataLoader id=2] initializeNewPublishers: the loader is still catching up because we still don't know the high water mark yet. (org.apache.kafka.image.loader.MetadataLoader)
[2026-06-18 17:14:03,920] INFO [broker-2-to-controller-forwarding-channel-manager]: Starting (org.apache.kafka.server.NodeToControllerRequestThread)
[2026-06-18 17:14:03,921] INFO Recorded new KRaft controller, from now on will use node localhost:9093 (id: 1 rack: null isFenced: false) (org.apache.kafka.server.NodeToControllerRequestThread)
[2026-06-18 17:14:03,935] INFO [client-metrics-reaper]: Starting (org.apache.kafka.server.util.timer.SystemTimerReaper$Reaper)
[2026-06-18 17:14:04,017] INFO [MetadataLoader id=2] initializeNewPublishers: the loader is still catching up because we still don't know the high water mark yet. (org.apache.kafka.image.loader.MetadataLoader)
[2026-06-18 17:14:04,107] INFO [RaftManager id=2] Registered the listener org.apache.kafka.image.loader.MetadataLoader@48091697 (org.apache.kafka.raft.KafkaRaftClient)
[2026-06-18 17:14:04,120] INFO [MetadataLoader id=2] initializeNewPublishers: the loader is still catching up because we still don't know the high water mark yet. (org.apache.kafka.image.loader.MetadataLoader)
[2026-06-18 17:14:04,224] INFO [MetadataLoader id=2] initializeNewPublishers: the loader is still catching up because we still don't know the high water mark yet. (org.apache.kafka.image.loader.MetadataLoader)
[2026-06-18 17:14:04,225] INFO [RaftManager id=2] Attempting durable transition to FollowerState(fetchTimeoutMs=2000, epoch=2, leader=1, leaderEndpoints=Endpoints(endpoints={ListenerName(CONTROLLER)=localhost/<unresolved>:9093}), votedKey=Optional.empty, voters=[1], highWatermark=Optional.empty, fetchingSnapshot=Optional.empty) from FollowerState(fetchTimeoutMs=2000, epoch=1, leader=1, leaderEndpoints=Endpoints(endpoints={ListenerName(CONTROLLER)=localhost/<unresolved>:9093}), votedKey=Optional.empty, voters=[1], highWatermark=Optional.empty, fetchingSnapshot=Optional.empty) (org.apache.kafka.raft.QuorumState)
[2026-06-18 17:14:04,230] INFO Updated connection-accept-rate max connection creation rate to 2147483647 (kafka.network.ConnectionQuotas)
[2026-06-18 17:14:04,240] INFO [RaftManager id=2] Completed transition to FollowerState(fetchTimeoutMs=2000, epoch=2, leader=1, leaderEndpoints=Endpoints(endpoints={ListenerName(CONTROLLER)=localhost/<unresolved>:9093}), votedKey=Optional.empty, voters=[1], highWatermark=Optional.empty, fetchingSnapshot=Optional.empty) from FollowerState(fetchTimeoutMs=2000, epoch=1, leader=1, leaderEndpoints=Endpoints(endpoints={ListenerName(CONTROLLER)=localhost/<unresolved>:9093}), votedKey=Optional.empty, voters=[1], highWatermark=Optional.empty, fetchingSnapshot=Optional.empty) (org.apache.kafka.raft.QuorumState)
[2026-06-18 17:14:04,288] INFO [SocketServer listenerType=BROKER, nodeId=2] Created data-plane acceptor and processors for endpoint : ListenerName(PLAINTEXT) (kafka.network.SocketServer)
[2026-06-18 17:14:04,307] INFO [broker-2-to-controller-alter-partition-channel-manager]: Starting (org.apache.kafka.server.NodeToControllerRequestThread)
[2026-06-18 17:14:04,308] INFO Recorded new KRaft controller, from now on will use node localhost:9093 (id: 1 rack: null isFenced: false) (org.apache.kafka.server.NodeToControllerRequestThread)
[2026-06-18 17:14:04,314] INFO [RaftManager id=2] High watermark set to Optional[LogOffsetMetadata(offset=1831, metadata=Optional.empty)] for the first time for epoch 2 (org.apache.kafka.raft.FollowerState)
[2026-06-18 17:14:04,319] INFO [RaftManager id=2] Setting the next offset of org.apache.kafka.image.loader.MetadataLoader@48091697 to 0 since there are no snapshots (org.apache.kafka.raft.KafkaRaftClient)
[2026-06-18 17:14:04,329] INFO [MetadataLoader id=2] maybePublishMetadata(LOG_DELTA): The loader is still catching up because we have loaded up to offset 0, but the high water mark is 1831 (org.apache.kafka.image.loader.MetadataLoader)
[2026-06-18 17:14:04,332] INFO [broker-2-to-controller-directory-assignments-channel-manager]: Starting (org.apache.kafka.server.NodeToControllerRequestThread)
[2026-06-18 17:14:04,333] INFO Recorded new KRaft controller, from now on will use node localhost:9093 (id: 1 rack: null isFenced: false) (org.apache.kafka.server.NodeToControllerRequestThread)
[2026-06-18 17:14:04,401] INFO [ExpirationReaper-2-Produce]: Starting (org.apache.kafka.server.purgatory.DelayedOperationPurgatory$ExpiredOperationReaper)
[2026-06-18 17:14:04,408] INFO [ExpirationReaper-2-Fetch]: Starting (org.apache.kafka.server.purgatory.DelayedOperationPurgatory$ExpiredOperationReaper)
[2026-06-18 17:14:04,416] INFO [ExpirationReaper-2-DeleteRecords]: Starting (org.apache.kafka.server.purgatory.DelayedOperationPurgatory$ExpiredOperationReaper)
[2026-06-18 17:14:04,417] INFO [ExpirationReaper-2-RemoteFetch]: Starting (org.apache.kafka.server.purgatory.DelayedOperationPurgatory$ExpiredOperationReaper)
[2026-06-18 17:14:04,418] INFO [MetadataLoader id=2] maybePublishMetadata(LOG_DELTA): The loader finished catching up to the current high water mark of 1831 (org.apache.kafka.image.loader.MetadataLoader)
[2026-06-18 17:14:04,418] INFO [ExpirationReaper-2-RemoteListOffsets]: Starting (org.apache.kafka.server.purgatory.DelayedOperationPurgatory$ExpiredOperationReaper)
[2026-06-18 17:14:04,422] INFO [ExpirationReaper-2-ShareFetch]: Starting (org.apache.kafka.server.purgatory.DelayedOperationPurgatory$ExpiredOperationReaper)
[2026-06-18 17:14:04,429] INFO [MetadataLoader id=2] InitializeNewPublishers: initializing SnapshotGenerator with a snapshot at offset 1830 (org.apache.kafka.image.loader.MetadataLoader)
[2026-06-18 17:14:04,449] INFO [share-coordinator-reaper]: Starting (org.apache.kafka.server.util.timer.SystemTimerReaper$Reaper)
[2026-06-18 17:14:04,479] INFO [share-coordinator-event-processor-0]: Starting (org.apache.kafka.coordinator.common.runtime.MultiThreadedEventProcessor$EventProcessorThread)
[2026-06-18 17:14:04,497] INFO [persister-state-manager-reaper]: Starting (org.apache.kafka.server.util.timer.SystemTimerReaper$Reaper)
[2026-06-18 17:14:04,499] INFO [PersisterStateManager]: Starting (org.apache.kafka.server.share.persister.PersisterStateManager$SendThread)
[2026-06-18 17:14:04,501] INFO [network-partition-metadata-client-reaper]: Starting (org.apache.kafka.server.util.timer.SystemTimerReaper$Reaper)
[2026-06-18 17:14:04,501] INFO [group-coordinator-reaper]: Starting (org.apache.kafka.server.util.timer.SystemTimerReaper$Reaper)
[2026-06-18 17:14:04,525] INFO [group-coordinator-event-processor-0]: Starting (org.apache.kafka.coordinator.common.runtime.MultiThreadedEventProcessor$EventProcessorThread)
[2026-06-18 17:14:04,525] INFO [group-coordinator-event-processor-2]: Starting (org.apache.kafka.coordinator.common.runtime.MultiThreadedEventProcessor$EventProcessorThread)
[2026-06-18 17:14:04,525] INFO [group-coordinator-event-processor-1]: Starting (org.apache.kafka.coordinator.common.runtime.MultiThreadedEventProcessor$EventProcessorThread)
[2026-06-18 17:14:04,525] INFO [group-coordinator-event-processor-3]: Starting (org.apache.kafka.coordinator.common.runtime.MultiThreadedEventProcessor$EventProcessorThread)
[2026-06-18 17:14:04,614] INFO [broker-2-to-controller-heartbeat-channel-manager]: Starting (org.apache.kafka.server.NodeToControllerRequestThread)
[2026-06-18 17:14:04,615] INFO Recorded new KRaft controller, from now on will use node localhost:9093 (id: 1 rack: null isFenced: false) (org.apache.kafka.server.NodeToControllerRequestThread)
[2026-06-18 17:14:04,619] INFO [BrokerLifecycleManager id=2] Incarnation oNFfQuBdRzSUkoB7OU5wig of broker 2 in cluster SPB5Ru5bTcu7suX_1Z_llA is now STARTING. (org.apache.kafka.server.BrokerLifecycleManager)
[2026-06-18 17:14:04,632] INFO [share-group-lock-timeout-reaper]: Starting (org.apache.kafka.server.util.timer.SystemTimerReaper$Reaper)
[2026-06-18 17:14:04,659] INFO [ExpirationReaper-2-AlterAcls]: Starting (org.apache.kafka.server.purgatory.DelayedOperationPurgatory$ExpiredOperationReaper)
[2026-06-18 17:14:04,678] INFO [BrokerLifecycleManager id=2] Successfully registered broker 2 with broker epoch 1832 (org.apache.kafka.server.BrokerLifecycleManager)
[2026-06-18 17:14:04,713] INFO [BrokerLifecycleManager id=2] The broker has caught up. Transitioning from STARTING to RECOVERY. (org.apache.kafka.server.BrokerLifecycleManager)
[2026-06-18 17:14:04,727] INFO [BrokerServer id=2] Waiting for the broker metadata publishers to be installed (kafka.server.BrokerServer)
[2026-06-18 17:14:04,728] INFO [BrokerServer id=2] Finished waiting for the broker metadata publishers to be installed (kafka.server.BrokerServer)
[2026-06-18 17:14:04,728] INFO [BrokerServer id=2] Waiting for the controller to acknowledge that we are caught up (kafka.server.BrokerServer)
[2026-06-18 17:14:04,728] INFO [MetadataLoader id=2] InitializeNewPublishers: initializing MetadataVersionPublisher(id=2) with a snapshot at offset 1832 (org.apache.kafka.image.loader.MetadataLoader)
[2026-06-18 17:14:04,729] INFO [BrokerServer id=2] Finished waiting for the controller to acknowledge that we are caught up (kafka.server.BrokerServer)
[2026-06-18 17:14:04,729] INFO [MetadataLoader id=2] InitializeNewPublishers: initializing BrokerMetadataPublisher with a snapshot at offset 1832 (org.apache.kafka.image.loader.MetadataLoader)
[2026-06-18 17:14:04,729] INFO [BrokerServer id=2] Waiting for the initial broker metadata update to be published (kafka.server.BrokerServer)
[2026-06-18 17:14:04,733] INFO [BrokerMetadataPublisher id=2] Publishing initial metadata at offset OffsetAndEpoch[offset=1832, epoch=2] with metadata.version Optional[4.3-IV0]. (kafka.server.metadata.BrokerMetadataPublisher)
[2026-06-18 17:14:04,739] INFO Loading logs from log dirs ArrayBuffer(C:\tmp\kraft-broker-logs) (kafka.log.LogManager)
[2026-06-18 17:14:04,763] INFO No logs found to be loaded in C:\tmp\kraft-broker-logs (kafka.log.LogManager)
[2026-06-18 17:14:04,784] INFO Loaded 0 logs in 40ms (kafka.log.LogManager)
[2026-06-18 17:14:04,785] INFO Starting log cleanup with a period of 300000 ms. (kafka.log.LogManager)
[2026-06-18 17:14:04,787] INFO Starting log flusher with a default period of 9223372036854775807 ms. (kafka.log.LogManager)
2026-06-18T11:44:04.812740800Z kafka-2-metadata-loader-event-handler ERROR Unable to delete file C:\kafka\logs\log-cleaner.log: java.nio.file.FileSystemException C:\kafka\logs\log-cleaner.log: The process cannot access the file because it is being used by another process
[2026-06-18 17:14:04,899] INFO [LogDirFailureHandler]: Starting (kafka.server.ReplicaManager$LogDirFailureHandler)
[2026-06-18 17:14:04,901] INFO [AddPartitionsToTxnSenderThread-2]: Starting (org.apache.kafka.server.transaction.AddPartitionsToTxnManager)
[2026-06-18 17:14:04,906] INFO [GroupCoordinator id=2] Starting up. (org.apache.kafka.coordinator.group.GroupCoordinatorService)
[2026-06-18 17:14:04,906] INFO [GroupCoordinator id=2] Startup complete. (org.apache.kafka.coordinator.group.GroupCoordinatorService)
[2026-06-18 17:14:04,907] INFO [TransactionCoordinator id=2] Starting up. (kafka.coordinator.transaction.TransactionCoordinator)
[2026-06-18 17:14:04,908] INFO [TransactionCoordinator id=2] Startup complete. (kafka.coordinator.transaction.TransactionCoordinator)
[2026-06-18 17:14:04,908] INFO [TxnMarkerSenderThread-2]: Starting (kafka.coordinator.transaction.TransactionMarkerChannelManager)
[2026-06-18 17:14:04,910] INFO [ShareCoordinator id=2] Starting up. (org.apache.kafka.coordinator.share.ShareCoordinatorService)
[2026-06-18 17:14:04,910] INFO [ShareCoordinator id=2] Startup complete. (org.apache.kafka.coordinator.share.ShareCoordinatorService)
[2026-06-18 17:14:04,924] INFO [DynamicConfigPublisher broker id=2] Updating cluster configuration : min.insync.replicas -> 1 (kafka.server.metadata.DynamicConfigPublisher)
[2026-06-18 17:14:04,927] INFO AbstractConfig values:
        group.consumer.assignment.interval.ms = 1000
        group.consumer.assignors = [uniform, range]
        group.consumer.heartbeat.interval.ms = 5000
        group.consumer.max.assignment.interval.ms = 15000
        group.consumer.max.heartbeat.interval.ms = 15000
        group.consumer.max.session.timeout.ms = 60000
        group.consumer.max.size = 2147483647
        group.consumer.migration.policy = bidirectional
        group.consumer.min.assignment.interval.ms = 0
        group.consumer.min.heartbeat.interval.ms = 5000
        group.consumer.min.session.timeout.ms = 45000
        group.consumer.regex.refresh.interval.ms = 600000
        group.consumer.session.timeout.ms = 45000
        group.coordinator.append.linger.ms = -1
        group.coordinator.background.threads = 2
        group.coordinator.cached.buffer.max.bytes = 1048588
        group.coordinator.rebalance.protocols = [classic, consumer, streams]
        group.coordinator.threads = 4
        group.initial.rebalance.delay.ms = 3000
        group.max.session.timeout.ms = 1800000
        group.max.size = 2147483647
        group.min.session.timeout.ms = 6000
        group.share.assignment.interval.ms = 1000
        group.share.assignors = [simple]
        group.share.heartbeat.interval.ms = 5000
        group.share.initialize.retry.interval.ms = 30000
        group.share.max.assignment.interval.ms = 15000
        group.share.max.heartbeat.interval.ms = 15000
        group.share.max.session.timeout.ms = 60000
        group.share.max.size = 200
        group.share.min.assignment.interval.ms = 0
        group.share.min.heartbeat.interval.ms = 5000
        group.share.min.session.timeout.ms = 45000
        group.share.session.timeout.ms = 45000
        group.streams.assignment.interval.ms = 1000
        group.streams.heartbeat.interval.ms = 5000
        group.streams.initial.rebalance.delay.ms = 3000
        group.streams.max.assignment.interval.ms = 15000
        group.streams.max.heartbeat.interval.ms = 15000
        group.streams.max.session.timeout.ms = 60000
        group.streams.max.size = 2147483647
        group.streams.max.standby.replicas = 2
        group.streams.min.assignment.interval.ms = 0
        group.streams.min.heartbeat.interval.ms = 5000
        group.streams.min.session.timeout.ms = 45000
        group.streams.num.standby.replicas = 0
        group.streams.session.timeout.ms = 45000
        offset.metadata.max.bytes = 4096
        offsets.commit.timeout.ms = 5000
        offsets.load.buffer.size = 5242880
        offsets.retention.check.interval.ms = 600000
        offsets.retention.minutes = 10080
        offsets.topic.compression.codec = 0
        offsets.topic.num.partitions = 50
        offsets.topic.replication.factor = 1
        offsets.topic.segment.bytes = 104857600
 (org.apache.kafka.common.config.AbstractConfig)
[2026-06-18 17:14:04,929] INFO KafkaConfig values:
        add.partitions.to.txn.retry.backoff.max.ms = 100
        add.partitions.to.txn.retry.backoff.ms = 20
        advertised.listeners = [PLAINTEXT://localhost:9092]
        alter.config.policy.class.name = null
        alter.log.dirs.replication.quota.window.num = 11
        alter.log.dirs.replication.quota.window.size.seconds = 1
        authorizer.class.name =
        auto.create.topics.enable = true
        auto.leader.rebalance.enable = true
        background.threads = 10
        broker.heartbeat.interval.ms = 2000
        broker.id = 2
        broker.rack = null
        broker.session.timeout.ms = 9000
        client.quota.callback.class = null
        compression.gzip.level = -1
        compression.lz4.level = 9
        compression.type = producer
        compression.zstd.level = 3
        config.providers = []
        connection.failed.authentication.delay.ms = 100
        connections.max.idle.ms = 600000
        connections.max.reauth.ms = 0
        controlled.shutdown.enable = true
        controller.listener.names = [CONTROLLER]
        controller.performance.always.log.threshold.ms = 2000
        controller.performance.sample.period.ms = 60000
        controller.quorum.append.linger.ms = 25
        controller.quorum.auto.join.enable = false
        controller.quorum.bootstrap.servers = [localhost:9093]
        controller.quorum.election.backoff.max.ms = 1000
        controller.quorum.election.timeout.ms = 1000
        controller.quorum.fetch.max.bytes = 1048576
        controller.quorum.fetch.snapshot.max.bytes = 1048576
        controller.quorum.fetch.timeout.ms = 2000
        controller.quorum.request.timeout.ms = 2000
        controller.quorum.retry.backoff.ms = 20
        controller.quorum.voters = [1@localhost:9093]
        controller.quota.window.num = 11
        controller.quota.window.size.seconds = 1
        controller.socket.timeout.ms = 30000
        cordoned.log.dirs = []
        create.topic.policy.class.name = null
        default.replication.factor = 1
        delegation.token.expiry.check.interval.ms = 3600000
        delegation.token.expiry.time.ms = 86400000
        delegation.token.max.lifetime.ms = 604800000
        delegation.token.secret.key = null
        delete.records.purgatory.purge.interval.requests = 1
        delete.topic.enable = true
        early.start.listeners = null
        fetch.max.bytes = 57671680
        fetch.purgatory.purge.interval.requests = 1000
        follower.fetch.last.tiered.offset.enable = false
        group.consumer.assignment.interval.ms = 1000
        group.consumer.assignors = [uniform, range]
        group.consumer.heartbeat.interval.ms = 5000
        group.consumer.max.assignment.interval.ms = 15000
        group.consumer.max.heartbeat.interval.ms = 15000
        group.consumer.max.session.timeout.ms = 60000
        group.consumer.max.size = 2147483647
        group.consumer.migration.policy = bidirectional
        group.consumer.min.assignment.interval.ms = 0
        group.consumer.min.heartbeat.interval.ms = 5000
        group.consumer.min.session.timeout.ms = 45000
        group.consumer.regex.refresh.interval.ms = 600000
        group.consumer.session.timeout.ms = 45000
        group.coordinator.append.linger.ms = -1
        group.coordinator.background.threads = 2
        group.coordinator.cached.buffer.max.bytes = 1048588
        group.coordinator.rebalance.protocols = [classic, consumer, streams]
        group.coordinator.threads = 4
        group.initial.rebalance.delay.ms = 3000
        group.max.session.timeout.ms = 1800000
        group.max.size = 2147483647
        group.min.session.timeout.ms = 6000
        group.share.assignment.interval.ms = 1000
        group.share.assignors = [simple]
        group.share.delivery.count.limit = 5
        group.share.heartbeat.interval.ms = 5000
        group.share.initialize.retry.interval.ms = 30000
        group.share.max.assignment.interval.ms = 15000
        group.share.max.delivery.count.limit = 10
        group.share.max.heartbeat.interval.ms = 15000
        group.share.max.partition.max.record.locks = 4000
        group.share.max.record.lock.duration.ms = 60000
        group.share.max.session.timeout.ms = 60000
        group.share.max.share.sessions = 2000
        group.share.max.size = 200
        group.share.min.assignment.interval.ms = 0
        group.share.min.delivery.count.limit = 2
        group.share.min.heartbeat.interval.ms = 5000
        group.share.min.partition.max.record.locks = 100
        group.share.min.record.lock.duration.ms = 15000
        group.share.min.session.timeout.ms = 45000
        group.share.partition.max.record.locks = 2000
        group.share.persister.class.name = org.apache.kafka.server.share.persister.DefaultStatePersister
        group.share.record.lock.duration.ms = 30000
        group.share.session.timeout.ms = 45000
        group.streams.assignment.interval.ms = 1000
        group.streams.heartbeat.interval.ms = 5000
        group.streams.initial.rebalance.delay.ms = 3000
        group.streams.max.assignment.interval.ms = 15000
        group.streams.max.heartbeat.interval.ms = 15000
        group.streams.max.session.timeout.ms = 60000
        group.streams.max.size = 2147483647
        group.streams.max.standby.replicas = 2
        group.streams.min.assignment.interval.ms = 0
        group.streams.min.heartbeat.interval.ms = 5000
        group.streams.min.session.timeout.ms = 45000
        group.streams.num.standby.replicas = 0
        group.streams.session.timeout.ms = 45000
        initial.broker.registration.timeout.ms = 60000
        inter.broker.listener.name = PLAINTEXT
        internal.metadata.delete.delay.millis = 60000
        internal.metadata.log.segment.bytes = null
        internal.metadata.max.batch.size.in.bytes = 8388608
        kafka.metrics.polling.interval.secs = 10
        kafka.metrics.reporters = []
        leader.imbalance.check.interval.seconds = 300
        listener.security.protocol.map = CONTROLLER:PLAINTEXT,PLAINTEXT:PLAINTEXT,SSL:SSL,SASL_PLAINTEXT:SASL_PLAINTEXT,SASL_SSL:SASL_SSL
        listeners = [PLAINTEXT://localhost:9092]
        log.cleaner.backoff.ms = 15000
        log.cleaner.dedupe.buffer.size = 134217728
        log.cleaner.delete.retention.ms = 86400000
        log.cleaner.enable = true
        log.cleaner.io.buffer.load.factor = 0.9
        log.cleaner.io.buffer.size = 524288
        log.cleaner.io.max.bytes.per.second = 1.7976931348623157E308
        log.cleaner.max.compaction.lag.ms = 9223372036854775807
        log.cleaner.min.cleanable.ratio = 0.5
        log.cleaner.min.compaction.lag.ms = 0
        log.cleaner.threads = 1
        log.cleanup.policy = [delete]
        log.dir = [/tmp/kafka-logs]
        log.dir.failure.timeout.ms = 30000
        log.dirs = [/tmp/kraft-broker-logs]
        log.flush.interval.messages = 9223372036854775807
        log.flush.interval.ms = null
        log.flush.offset.checkpoint.interval.ms = 60000
        log.flush.scheduler.interval.ms = 9223372036854775807
        log.flush.start.offset.checkpoint.interval.ms = 60000
        log.index.interval.bytes = 4096
        log.index.size.max.bytes = 10485760
        log.initial.task.delay.ms = 30000
        log.local.retention.bytes = -2
        log.local.retention.ms = -2
        log.message.timestamp.after.max.ms = 3600000
        log.message.timestamp.before.max.ms = 9223372036854775807
        log.message.timestamp.type = CreateTime
        log.preallocate = false
        log.retention.bytes = -1
        log.retention.check.interval.ms = 300000
        log.retention.hours = 168
        log.retention.minutes = null
        log.retention.ms = null
        log.roll.hours = 168
        log.roll.jitter.hours = 0
        log.roll.jitter.ms = null
        log.roll.ms = null
        log.segment.bytes = 1073741824
        log.segment.delete.delay.ms = 60000
        max.connection.creation.rate = 2147483647
        max.connections = 2147483647
        max.connections.per.ip = 2147483647
        max.connections.per.ip.overrides =
        max.incremental.fetch.session.cache.slots = 1000
        max.request.partition.size.limit = 2000
        message.max.bytes = 1048588
        metadata.log.dir = null
        metadata.log.max.record.bytes.between.snapshots = 20971520
        metadata.log.max.snapshot.interval.ms = 3600000
        metadata.log.segment.bytes = 1073741824
        metadata.log.segment.ms = 604800000
        metadata.max.idle.interval.ms = 500
        metadata.max.retention.bytes = 104857600
        metadata.max.retention.ms = 604800000
        metric.reporters = [org.apache.kafka.common.metrics.JmxReporter]
        metrics.num.samples = 2
        metrics.recording.level = INFO
        metrics.sample.window.ms = 30000
        min.insync.replicas = 1
        node.id = 2
        num.io.threads = 8
        num.network.threads = 3
        num.partitions = 1
        num.recovery.threads.per.data.dir = 2
        num.replica.alter.log.dirs.threads = null
        num.replica.fetchers = 1
        offset.metadata.max.bytes = 4096
        offsets.commit.timeout.ms = 5000
        offsets.load.buffer.size = 5242880
        offsets.retention.check.interval.ms = 600000
        offsets.retention.minutes = 10080
        offsets.topic.compression.codec = 0
        offsets.topic.num.partitions = 50
        offsets.topic.replication.factor = 1
        offsets.topic.segment.bytes = 104857600
        principal.builder.class = class org.apache.kafka.common.security.authenticator.DefaultKafkaPrincipalBuilder
        process.roles = [broker]
        producer.id.expiration.check.interval.ms = 600000
        producer.id.expiration.ms = 86400000
        producer.purgatory.purge.interval.requests = 1000
        queued.max.request.bytes = -1
        queued.max.requests = 500
        quota.window.num = 11
        quota.window.size.seconds = 1
        remote.fetch.max.wait.ms = 500
        remote.list.offsets.request.timeout.ms = 30000
        remote.log.index.file.cache.total.size.bytes = 1073741824
        remote.log.index.file.cache.ttl.ms = 900000
        remote.log.manager.copier.thread.pool.size = 10
        remote.log.manager.copy.max.bytes.per.second = 9223372036854775807
        remote.log.manager.copy.quota.window.num = 11
        remote.log.manager.copy.quota.window.size.seconds = 1
        remote.log.manager.expiration.thread.pool.size = 10
        remote.log.manager.fetch.max.bytes.per.second = 9223372036854775807
        remote.log.manager.fetch.quota.window.num = 11
        remote.log.manager.fetch.quota.window.size.seconds = 1
        remote.log.manager.follower.thread.pool.size = 2
        remote.log.manager.task.interval.ms = 30000
        remote.log.manager.task.retry.backoff.max.ms = 30000
        remote.log.manager.task.retry.backoff.ms = 500
        remote.log.manager.task.retry.jitter = 0.2
        remote.log.manager.thread.pool.size = 2
        remote.log.metadata.custom.metadata.max.bytes = 128
        remote.log.metadata.manager.class.name = org.apache.kafka.server.log.remote.metadata.storage.TopicBasedRemoteLogMetadataManager
        remote.log.metadata.manager.class.path = null
        remote.log.metadata.manager.impl.prefix = rlmm.config.
        remote.log.metadata.manager.listener.name = null
        remote.log.reader.max.pending.tasks = 100
        remote.log.reader.threads = 10
        remote.log.storage.manager.class.name = null
        remote.log.storage.manager.class.path = null
        remote.log.storage.manager.impl.prefix = rsm.config.
        remote.log.storage.system.enable = false
        replica.fetch.backoff.ms = 1000
        replica.fetch.max.bytes = 1048576
        replica.fetch.min.bytes = 1
        replica.fetch.response.max.bytes = 10485760
        replica.fetch.wait.max.ms = 500
        replica.high.watermark.checkpoint.interval.ms = 5000
        replica.lag.time.max.ms = 30000
        replica.selector.class = null
        replica.socket.receive.buffer.bytes = 65536
        replica.socket.timeout.ms = 30000
        replication.quota.window.num = 11
        replication.quota.window.size.seconds = 1
        request.timeout.ms = 30000
        sasl.client.callback.handler.class = null
        sasl.enabled.mechanisms = [GSSAPI]
        sasl.jaas.config = null
        sasl.kerberos.kinit.cmd = /usr/bin/kinit
        sasl.kerberos.min.time.before.relogin = 60000
        sasl.kerberos.principal.to.local.rules = [DEFAULT]
        sasl.kerberos.service.name = null
        sasl.kerberos.ticket.renew.jitter = 0.05
        sasl.kerberos.ticket.renew.window.factor = 0.8
        sasl.login.callback.handler.class = null
        sasl.login.class = null
        sasl.login.connect.timeout.ms = null
        sasl.login.read.timeout.ms = null
        sasl.login.refresh.buffer.seconds = 300
        sasl.login.refresh.min.period.seconds = 60
        sasl.login.refresh.window.factor = 0.8
        sasl.login.refresh.window.jitter = 0.05
        sasl.login.retry.backoff.max.ms = 10000
        sasl.login.retry.backoff.ms = 100
        sasl.mechanism.controller.protocol = GSSAPI
        sasl.mechanism.inter.broker.protocol = GSSAPI
        sasl.oauthbearer.assertion.algorithm = RS256
        sasl.oauthbearer.assertion.claim.aud = null
        sasl.oauthbearer.assertion.claim.exp.seconds = 300
        sasl.oauthbearer.assertion.claim.iss = null
        sasl.oauthbearer.assertion.claim.jti.include = false
        sasl.oauthbearer.assertion.claim.nbf.seconds = 60
        sasl.oauthbearer.assertion.claim.sub = null
        sasl.oauthbearer.assertion.file = null
        sasl.oauthbearer.assertion.private.key.file = null
        sasl.oauthbearer.assertion.private.key.passphrase = null
        sasl.oauthbearer.assertion.template.file = null
        sasl.oauthbearer.client.credentials.client.id = null
        sasl.oauthbearer.client.credentials.client.secret = null
        sasl.oauthbearer.clock.skew.seconds = 30
        sasl.oauthbearer.expected.audience = []
        sasl.oauthbearer.expected.issuer = null
        sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
        sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
        sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
        sasl.oauthbearer.jwks.endpoint.url = null
        sasl.oauthbearer.jwt.retriever.class = class org.apache.kafka.common.security.oauthbearer.DefaultJwtRetriever
        sasl.oauthbearer.jwt.validator.class = class org.apache.kafka.common.security.oauthbearer.DefaultJwtValidator
        sasl.oauthbearer.scope = null
        sasl.oauthbearer.scope.claim.name = scope
        sasl.oauthbearer.sub.claim.name = sub
        sasl.oauthbearer.token.endpoint.url = null
        sasl.server.callback.handler.class = null
        sasl.server.max.receive.size = 524288
        security.inter.broker.protocol = PLAINTEXT
        security.providers = null
        server.max.startup.time.ms = 9223372036854775807
        share.coordinator.append.linger.ms = -1
        share.coordinator.cached.buffer.max.bytes = 1048588
        share.coordinator.cold.partition.snapshot.interval.ms = 300000
        share.coordinator.load.buffer.size = 5242880
        share.coordinator.snapshot.update.records.per.snapshot = 500
        share.coordinator.state.topic.compression.codec = 0
        share.coordinator.state.topic.min.isr = 1
        share.coordinator.state.topic.num.partitions = 50
        share.coordinator.state.topic.prune.interval.ms = 300000
        share.coordinator.state.topic.replication.factor = 1
        share.coordinator.state.topic.segment.bytes = 104857600
        share.coordinator.threads = 1
        share.coordinator.write.timeout.ms = 5000
        share.fetch.purgatory.purge.interval.requests = 1000
        socket.connection.setup.timeout.max.ms = 30000
        socket.connection.setup.timeout.ms = 10000
        socket.listen.backlog.size = 50
        socket.receive.buffer.bytes = 102400
        socket.request.max.bytes = 104857600
        socket.send.buffer.bytes = 102400
        ssl.allow.dn.changes = false
        ssl.allow.san.changes = false
        ssl.cipher.suites = []
        ssl.client.auth = none
        ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
        ssl.endpoint.identification.algorithm = https
        ssl.engine.factory.class = null
        ssl.key.password = null
        ssl.keymanager.algorithm = SunX509
        ssl.keystore.certificate.chain = null
        ssl.keystore.key = null
        ssl.keystore.location = null
        ssl.keystore.password = null
        ssl.keystore.type = JKS
        ssl.principal.mapping.rules = DEFAULT
        ssl.protocol = TLSv1.3
        ssl.provider = null
        ssl.secure.random.implementation = null
        ssl.trustmanager.algorithm = PKIX
        ssl.truststore.certificates = null
        ssl.truststore.location = null
        ssl.truststore.password = null
        ssl.truststore.type = JKS
        telemetry.max.bytes = 1048576
        transaction.abort.timed.out.transaction.cleanup.interval.ms = 10000
        transaction.max.timeout.ms = 900000
        transaction.partition.verification.enable = true
        transaction.remove.expired.transaction.cleanup.interval.ms = 3600000
        transaction.state.log.load.buffer.size = 5242880
        transaction.state.log.min.isr = 1
        transaction.state.log.num.partitions = 50
        transaction.state.log.replication.factor = 1
        transaction.state.log.segment.bytes = 104857600
        transaction.two.phase.commit.enable = false
        transactional.id.expiration.ms = 604800000
        unclean.leader.election.enable = false
        unclean.leader.election.interval.ms = 300000
        unstable.api.versions.enable = false
        unstable.feature.versions.enable = false
 (org.apache.kafka.common.config.AbstractConfig)
[2026-06-18 17:14:04,932] WARN num.partitions is defined in the broker role. This configuration will be ignored in 5.0. Please set num.partitions in the controller role instead. (kafka.server.KafkaConfig)
[2026-06-18 17:14:04,955] INFO [BrokerMetadataPublisher id=2] Feature share.version has been updated to version 1 (kafka.server.metadata.BrokerMetadataPublisher)
[2026-06-18 17:14:04,956] INFO [MetadataLoader id=2] InitializeNewPublishers: initializing BrokerRegistrationTracker(id=2) with a snapshot at offset 1832 (org.apache.kafka.image.loader.MetadataLoader)
[2026-06-18 17:14:04,956] INFO [BrokerServer id=2] Finished waiting for the initial broker metadata update to be published (kafka.server.BrokerServer)
[2026-06-18 17:14:04,962] INFO KafkaConfig values:
        add.partitions.to.txn.retry.backoff.max.ms = 100
        add.partitions.to.txn.retry.backoff.ms = 20
        advertised.listeners = [PLAINTEXT://localhost:9092]
        alter.config.policy.class.name = null
        alter.log.dirs.replication.quota.window.num = 11
        alter.log.dirs.replication.quota.window.size.seconds = 1
        authorizer.class.name =
        auto.create.topics.enable = true
        auto.leader.rebalance.enable = true
        background.threads = 10
        broker.heartbeat.interval.ms = 2000
        broker.id = 2
        broker.rack = null
        broker.session.timeout.ms = 9000
        client.quota.callback.class = null
        compression.gzip.level = -1
        compression.lz4.level = 9
        compression.type = producer
        compression.zstd.level = 3
        config.providers = []
        connection.failed.authentication.delay.ms = 100
        connections.max.idle.ms = 600000
        connections.max.reauth.ms = 0
        controlled.shutdown.enable = true
        controller.listener.names = [CONTROLLER]
        controller.performance.always.log.threshold.ms = 2000
        controller.performance.sample.period.ms = 60000
        controller.quorum.append.linger.ms = 25
        controller.quorum.auto.join.enable = false
        controller.quorum.bootstrap.servers = [localhost:9093]
        controller.quorum.election.backoff.max.ms = 1000
        controller.quorum.election.timeout.ms = 1000
        controller.quorum.fetch.max.bytes = 1048576
        controller.quorum.fetch.snapshot.max.bytes = 1048576
        controller.quorum.fetch.timeout.ms = 2000
        controller.quorum.request.timeout.ms = 2000
        controller.quorum.retry.backoff.ms = 20
        controller.quorum.voters = [1@localhost:9093]
        controller.quota.window.num = 11
        controller.quota.window.size.seconds = 1
        controller.socket.timeout.ms = 30000
        cordoned.log.dirs = []
        create.topic.policy.class.name = null
        default.replication.factor = 1
        delegation.token.expiry.check.interval.ms = 3600000
        delegation.token.expiry.time.ms = 86400000
        delegation.token.max.lifetime.ms = 604800000
        delegation.token.secret.key = null
        delete.records.purgatory.purge.interval.requests = 1
        delete.topic.enable = true
        early.start.listeners = null
        fetch.max.bytes = 57671680
        fetch.purgatory.purge.interval.requests = 1000
        follower.fetch.last.tiered.offset.enable = false
        group.consumer.assignment.interval.ms = 1000
        group.consumer.assignors = [uniform, range]
        group.consumer.heartbeat.interval.ms = 5000
        group.consumer.max.assignment.interval.ms = 15000
        group.consumer.max.heartbeat.interval.ms = 15000
        group.consumer.max.session.timeout.ms = 60000
        group.consumer.max.size = 2147483647
        group.consumer.migration.policy = bidirectional
        group.consumer.min.assignment.interval.ms = 0
        group.consumer.min.heartbeat.interval.ms = 5000
        group.consumer.min.session.timeout.ms = 45000
        group.consumer.regex.refresh.interval.ms = 600000
        group.consumer.session.timeout.ms = 45000
        group.coordinator.append.linger.ms = -1
        group.coordinator.background.threads = 2
        group.coordinator.cached.buffer.max.bytes = 1048588
        group.coordinator.rebalance.protocols = [classic, consumer, streams]
        group.coordinator.threads = 4
        group.initial.rebalance.delay.ms = 3000
        group.max.session.timeout.ms = 1800000
        group.max.size = 2147483647
        group.min.session.timeout.ms = 6000
        group.share.assignment.interval.ms = 1000
        group.share.assignors = [simple]
        group.share.delivery.count.limit = 5
        group.share.heartbeat.interval.ms = 5000
        group.share.initialize.retry.interval.ms = 30000
        group.share.max.assignment.interval.ms = 15000
        group.share.max.delivery.count.limit = 10
        group.share.max.heartbeat.interval.ms = 15000
        group.share.max.partition.max.record.locks = 4000
        group.share.max.record.lock.duration.ms = 60000
        group.share.max.session.timeout.ms = 60000
        group.share.max.share.sessions = 2000
        group.share.max.size = 200
        group.share.min.assignment.interval.ms = 0
        group.share.min.delivery.count.limit = 2
        group.share.min.heartbeat.interval.ms = 5000
        group.share.min.partition.max.record.locks = 100
        group.share.min.record.lock.duration.ms = 15000
        group.share.min.session.timeout.ms = 45000
        group.share.partition.max.record.locks = 2000
        group.share.persister.class.name = org.apache.kafka.server.share.persister.DefaultStatePersister
        group.share.record.lock.duration.ms = 30000
        group.share.session.timeout.ms = 45000
        group.streams.assignment.interval.ms = 1000
        group.streams.heartbeat.interval.ms = 5000
        group.streams.initial.rebalance.delay.ms = 3000
        group.streams.max.assignment.interval.ms = 15000
        group.streams.max.heartbeat.interval.ms = 15000
        group.streams.max.session.timeout.ms = 60000
        group.streams.max.size = 2147483647
        group.streams.max.standby.replicas = 2
        group.streams.min.assignment.interval.ms = 0
        group.streams.min.heartbeat.interval.ms = 5000
        group.streams.min.session.timeout.ms = 45000
        group.streams.num.standby.replicas = 0
        group.streams.session.timeout.ms = 45000
        initial.broker.registration.timeout.ms = 60000
        inter.broker.listener.name = PLAINTEXT
        internal.metadata.delete.delay.millis = 60000
        internal.metadata.log.segment.bytes = null
        internal.metadata.max.batch.size.in.bytes = 8388608
        kafka.metrics.polling.interval.secs = 10
        kafka.metrics.reporters = []
        leader.imbalance.check.interval.seconds = 300
        listener.security.protocol.map = CONTROLLER:PLAINTEXT,PLAINTEXT:PLAINTEXT,SSL:SSL,SASL_PLAINTEXT:SASL_PLAINTEXT,SASL_SSL:SASL_SSL
        listeners = [PLAINTEXT://localhost:9092]
        log.cleaner.backoff.ms = 15000
        log.cleaner.dedupe.buffer.size = 134217728
        log.cleaner.delete.retention.ms = 86400000
        log.cleaner.enable = true
        log.cleaner.io.buffer.load.factor = 0.9
        log.cleaner.io.buffer.size = 524288
        log.cleaner.io.max.bytes.per.second = 1.7976931348623157E308
        log.cleaner.max.compaction.lag.ms = 9223372036854775807
        log.cleaner.min.cleanable.ratio = 0.5
        log.cleaner.min.compaction.lag.ms = 0
        log.cleaner.threads = 1
        log.cleanup.policy = [delete]
        log.dir = [/tmp/kafka-logs]
        log.dir.failure.timeout.ms = 30000
        log.dirs = [/tmp/kraft-broker-logs]
        log.flush.interval.messages = 9223372036854775807
        log.flush.interval.ms = null
        log.flush.offset.checkpoint.interval.ms = 60000
        log.flush.scheduler.interval.ms = 9223372036854775807
        log.flush.start.offset.checkpoint.interval.ms = 60000
        log.index.interval.bytes = 4096
        log.index.size.max.bytes = 10485760
        log.initial.task.delay.ms = 30000
        log.local.retention.bytes = -2
        log.local.retention.ms = -2
        log.message.timestamp.after.max.ms = 3600000
        log.message.timestamp.before.max.ms = 9223372036854775807
        log.message.timestamp.type = CreateTime
        log.preallocate = false
        log.retention.bytes = -1
        log.retention.check.interval.ms = 300000
        log.retention.hours = 168
        log.retention.minutes = null
        log.retention.ms = null
        log.roll.hours = 168
        log.roll.jitter.hours = 0
        log.roll.jitter.ms = null
        log.roll.ms = null
        log.segment.bytes = 1073741824
        log.segment.delete.delay.ms = 60000
        max.connection.creation.rate = 2147483647
        max.connections = 2147483647
        max.connections.per.ip = 2147483647
        max.connections.per.ip.overrides =
        max.incremental.fetch.session.cache.slots = 1000
        max.request.partition.size.limit = 2000
        message.max.bytes = 1048588
        metadata.log.dir = null
        metadata.log.max.record.bytes.between.snapshots = 20971520
        metadata.log.max.snapshot.interval.ms = 3600000
        metadata.log.segment.bytes = 1073741824
        metadata.log.segment.ms = 604800000
        metadata.max.idle.interval.ms = 500
        metadata.max.retention.bytes = 104857600
        metadata.max.retention.ms = 604800000
        metric.reporters = [org.apache.kafka.common.metrics.JmxReporter]
        metrics.num.samples = 2
        metrics.recording.level = INFO
        metrics.sample.window.ms = 30000
        min.insync.replicas = 1
        node.id = 2
        num.io.threads = 8
        num.network.threads = 3
        num.partitions = 1
        num.recovery.threads.per.data.dir = 2
        num.replica.alter.log.dirs.threads = null
        num.replica.fetchers = 1
        offset.metadata.max.bytes = 4096
        offsets.commit.timeout.ms = 5000
        offsets.load.buffer.size = 5242880
        offsets.retention.check.interval.ms = 600000
        offsets.retention.minutes = 10080
        offsets.topic.compression.codec = 0
        offsets.topic.num.partitions = 50
        offsets.topic.replication.factor = 1
        offsets.topic.segment.bytes = 104857600
        principal.builder.class = class org.apache.kafka.common.security.authenticator.DefaultKafkaPrincipalBuilder
        process.roles = [broker]
        producer.id.expiration.check.interval.ms = 600000
        producer.id.expiration.ms = 86400000
        producer.purgatory.purge.interval.requests = 1000
        queued.max.request.bytes = -1
        queued.max.requests = 500
        quota.window.num = 11
        quota.window.size.seconds = 1
        remote.fetch.max.wait.ms = 500
        remote.list.offsets.request.timeout.ms = 30000
        remote.log.index.file.cache.total.size.bytes = 1073741824
        remote.log.index.file.cache.ttl.ms = 900000
        remote.log.manager.copier.thread.pool.size = 10
        remote.log.manager.copy.max.bytes.per.second = 9223372036854775807
        remote.log.manager.copy.quota.window.num = 11
        remote.log.manager.copy.quota.window.size.seconds = 1
        remote.log.manager.expiration.thread.pool.size = 10
        remote.log.manager.fetch.max.bytes.per.second = 9223372036854775807
        remote.log.manager.fetch.quota.window.num = 11
        remote.log.manager.fetch.quota.window.size.seconds = 1
        remote.log.manager.follower.thread.pool.size = 2
        remote.log.manager.task.interval.ms = 30000
        remote.log.manager.task.retry.backoff.max.ms = 30000
        remote.log.manager.task.retry.backoff.ms = 500
        remote.log.manager.task.retry.jitter = 0.2
        remote.log.manager.thread.pool.size = 2
        remote.log.metadata.custom.metadata.max.bytes = 128
        remote.log.metadata.manager.class.name = org.apache.kafka.server.log.remote.metadata.storage.TopicBasedRemoteLogMetadataManager
        remote.log.metadata.manager.class.path = null
        remote.log.metadata.manager.impl.prefix = rlmm.config.
        remote.log.metadata.manager.listener.name = null
        remote.log.reader.max.pending.tasks = 100
        remote.log.reader.threads = 10
        remote.log.storage.manager.class.name = null
        remote.log.storage.manager.class.path = null
        remote.log.storage.manager.impl.prefix = rsm.config.
        remote.log.storage.system.enable = false
        replica.fetch.backoff.ms = 1000
        replica.fetch.max.bytes = 1048576
        replica.fetch.min.bytes = 1
        replica.fetch.response.max.bytes = 10485760
        replica.fetch.wait.max.ms = 500
        replica.high.watermark.checkpoint.interval.ms = 5000
        replica.lag.time.max.ms = 30000
        replica.selector.class = null
        replica.socket.receive.buffer.bytes = 65536
        replica.socket.timeout.ms = 30000
        replication.quota.window.num = 11
        replication.quota.window.size.seconds = 1
        request.timeout.ms = 30000
        sasl.client.callback.handler.class = null
        sasl.enabled.mechanisms = [GSSAPI]
        sasl.jaas.config = null
        sasl.kerberos.kinit.cmd = /usr/bin/kinit
        sasl.kerberos.min.time.before.relogin = 60000
        sasl.kerberos.principal.to.local.rules = [DEFAULT]
        sasl.kerberos.service.name = null
        sasl.kerberos.ticket.renew.jitter = 0.05
        sasl.kerberos.ticket.renew.window.factor = 0.8
        sasl.login.callback.handler.class = null
        sasl.login.class = null
        sasl.login.connect.timeout.ms = null
        sasl.login.read.timeout.ms = null
        sasl.login.refresh.buffer.seconds = 300
        sasl.login.refresh.min.period.seconds = 60
        sasl.login.refresh.window.factor = 0.8
        sasl.login.refresh.window.jitter = 0.05
        sasl.login.retry.backoff.max.ms = 10000
        sasl.login.retry.backoff.ms = 100
        sasl.mechanism.controller.protocol = GSSAPI
        sasl.mechanism.inter.broker.protocol = GSSAPI
        sasl.oauthbearer.assertion.algorithm = RS256
        sasl.oauthbearer.assertion.claim.aud = null
        sasl.oauthbearer.assertion.claim.exp.seconds = 300
        sasl.oauthbearer.assertion.claim.iss = null
        sasl.oauthbearer.assertion.claim.jti.include = false
        sasl.oauthbearer.assertion.claim.nbf.seconds = 60
        sasl.oauthbearer.assertion.claim.sub = null
        sasl.oauthbearer.assertion.file = null
        sasl.oauthbearer.assertion.private.key.file = null
        sasl.oauthbearer.assertion.private.key.passphrase = null
        sasl.oauthbearer.assertion.template.file = null
        sasl.oauthbearer.client.credentials.client.id = null
        sasl.oauthbearer.client.credentials.client.secret = null
        sasl.oauthbearer.clock.skew.seconds = 30
        sasl.oauthbearer.expected.audience = []
        sasl.oauthbearer.expected.issuer = null
        sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
        sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
        sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
        sasl.oauthbearer.jwks.endpoint.url = null
        sasl.oauthbearer.jwt.retriever.class = class org.apache.kafka.common.security.oauthbearer.DefaultJwtRetriever
        sasl.oauthbearer.jwt.validator.class = class org.apache.kafka.common.security.oauthbearer.DefaultJwtValidator
        sasl.oauthbearer.scope = null
        sasl.oauthbearer.scope.claim.name = scope
        sasl.oauthbearer.sub.claim.name = sub
        sasl.oauthbearer.token.endpoint.url = null
        sasl.server.callback.handler.class = null
        sasl.server.max.receive.size = 524288
        security.inter.broker.protocol = PLAINTEXT
        security.providers = null
        server.max.startup.time.ms = 9223372036854775807
        share.coordinator.append.linger.ms = -1
        share.coordinator.cached.buffer.max.bytes = 1048588
        share.coordinator.cold.partition.snapshot.interval.ms = 300000
        share.coordinator.load.buffer.size = 5242880
        share.coordinator.snapshot.update.records.per.snapshot = 500
        share.coordinator.state.topic.compression.codec = 0
        share.coordinator.state.topic.min.isr = 1
        share.coordinator.state.topic.num.partitions = 50
        share.coordinator.state.topic.prune.interval.ms = 300000
        share.coordinator.state.topic.replication.factor = 1
        share.coordinator.state.topic.segment.bytes = 104857600
        share.coordinator.threads = 1
        share.coordinator.write.timeout.ms = 5000
        share.fetch.purgatory.purge.interval.requests = 1000
        socket.connection.setup.timeout.max.ms = 30000
        socket.connection.setup.timeout.ms = 10000
        socket.listen.backlog.size = 50
        socket.receive.buffer.bytes = 102400
        socket.request.max.bytes = 104857600
        socket.send.buffer.bytes = 102400
        ssl.allow.dn.changes = false
        ssl.allow.san.changes = false
        ssl.cipher.suites = []
        ssl.client.auth = none
        ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
        ssl.endpoint.identification.algorithm = https
        ssl.engine.factory.class = null
        ssl.key.password = null
        ssl.keymanager.algorithm = SunX509
        ssl.keystore.certificate.chain = null
        ssl.keystore.key = null
        ssl.keystore.location = null
        ssl.keystore.password = null
        ssl.keystore.type = JKS
        ssl.principal.mapping.rules = DEFAULT
        ssl.protocol = TLSv1.3
        ssl.provider = null
        ssl.secure.random.implementation = null
        ssl.trustmanager.algorithm = PKIX
        ssl.truststore.certificates = null
        ssl.truststore.location = null
        ssl.truststore.password = null
        ssl.truststore.type = JKS
        telemetry.max.bytes = 1048576
        transaction.abort.timed.out.transaction.cleanup.interval.ms = 10000
        transaction.max.timeout.ms = 900000
        transaction.partition.verification.enable = true
        transaction.remove.expired.transaction.cleanup.interval.ms = 3600000
        transaction.state.log.load.buffer.size = 5242880
        transaction.state.log.min.isr = 1
        transaction.state.log.num.partitions = 50
        transaction.state.log.replication.factor = 1
        transaction.state.log.segment.bytes = 104857600
        transaction.two.phase.commit.enable = false
        transactional.id.expiration.ms = 604800000
        unclean.leader.election.enable = false
        unclean.leader.election.interval.ms = 300000
        unstable.api.versions.enable = false
        unstable.feature.versions.enable = false
 (org.apache.kafka.common.config.AbstractConfig)
[2026-06-18 17:14:04,967] WARN num.partitions is defined in the broker role. This configuration will be ignored in 5.0. Please set num.partitions in the controller role instead. (kafka.server.KafkaConfig)
[2026-06-18 17:14:04,971] INFO [BrokerLifecycleManager id=2] The broker is in RECOVERY. (org.apache.kafka.server.BrokerLifecycleManager)
[2026-06-18 17:14:04,973] INFO [BrokerServer id=2] Waiting for the broker to be unfenced (kafka.server.BrokerServer)
[2026-06-18 17:14:05,008] INFO [BrokerLifecycleManager id=2] The broker has been unfenced. Transitioning from RECOVERY to RUNNING. (org.apache.kafka.server.BrokerLifecycleManager)
[2026-06-18 17:14:05,010] INFO [BrokerServer id=2] Finished waiting for the broker to be unfenced (kafka.server.BrokerServer)
[2026-06-18 17:14:05,027] INFO authorizerStart completed for endpoint PLAINTEXT. Endpoint is now READY. (org.apache.kafka.server.network.EndpointReadyFutures)
[2026-06-18 17:14:05,029] INFO [SocketServer listenerType=BROKER, nodeId=2] Enabling request processing. (kafka.network.SocketServer)
[2026-06-18 17:14:05,034] INFO Awaiting socket connections on localhost:9092. (kafka.network.DataPlaneAcceptor)
[2026-06-18 17:14:05,041] INFO [BrokerServer id=2] Waiting for all of the authorizer futures to be completed (kafka.server.BrokerServer)
[2026-06-18 17:14:05,042] INFO [BrokerServer id=2] Finished waiting for all of the authorizer futures to be completed (kafka.server.BrokerServer)
[2026-06-18 17:14:05,042] INFO [BrokerServer id=2] Waiting for all of the SocketServer Acceptors to be started (kafka.server.BrokerServer)
[2026-06-18 17:14:05,043] INFO [BrokerServer id=2] Finished waiting for all of the SocketServer Acceptors to be started (kafka.server.BrokerServer)
[2026-06-18 17:14:05,045] INFO [BrokerServer id=2] Transition from STARTING to STARTED (kafka.server.BrokerServer)
[2026-06-18 17:14:05,047] INFO Kafka version: 4.3.0 (org.apache.kafka.common.utils.AppInfoParser)
[2026-06-18 17:14:05,048] INFO Kafka commitId: a9ce3221537b8653 (org.apache.kafka.common.utils.AppInfoParser)
[2026-06-18 17:14:05,048] INFO Kafka startTimeMs: 1781783045046 (org.apache.kafka.common.utils.AppInfoParser)
[2026-06-18 17:14:05,054] INFO [KafkaRaftServer nodeId=2] Kafka Server started (kafka.server.KafkaRaftServer)
[2026-06-18 17:19:17,565] INFO [ReplicaFetcherManager on broker 2] Removed fetcher for partitions Set(orders-0, orders-1, orders-2) (kafka.server.ReplicaFetcherManager)
[2026-06-18 17:19:17,647] INFO [LogLoader partition=orders-0, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:19:17,651] INFO Created log for partition orders-0 in C:\tmp\kraft-broker-logs\orders-0 with properties {} (kafka.log.LogManager)
[2026-06-18 17:19:17,654] INFO [Partition orders-0 broker=2] No checkpointed highwatermark is found for partition orders-0 (kafka.cluster.Partition)
[2026-06-18 17:19:17,656] INFO [Partition orders-0 broker=2] Log loaded for partition orders-0 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:19:17,671] INFO [LogLoader partition=orders-1, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:19:17,672] INFO Created log for partition orders-1 in C:\tmp\kraft-broker-logs\orders-1 with properties {} (kafka.log.LogManager)
[2026-06-18 17:19:17,672] INFO [Partition orders-1 broker=2] No checkpointed highwatermark is found for partition orders-1 (kafka.cluster.Partition)
[2026-06-18 17:19:17,673] INFO [Partition orders-1 broker=2] Log loaded for partition orders-1 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:19:17,680] INFO [LogLoader partition=orders-2, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:19:17,682] INFO Created log for partition orders-2 in C:\tmp\kraft-broker-logs\orders-2 with properties {} (kafka.log.LogManager)
[2026-06-18 17:19:17,682] INFO [Partition orders-2 broker=2] No checkpointed highwatermark is found for partition orders-2 (kafka.cluster.Partition)
[2026-06-18 17:19:17,683] INFO [Partition orders-2 broker=2] Log loaded for partition orders-2 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,613] INFO Sent auto-creation request for Set(__consumer_offsets) to the active controller. (kafka.server.DefaultAutoTopicCreationManager)
[2026-06-18 17:24:47,652] INFO [ReplicaFetcherManager on broker 2] Removed fetcher for partitions Set(__consumer_offsets-13, __consumer_offsets-46, __consumer_offsets-9, __consumer_offsets-42, __consumer_offsets-21, __consumer_offsets-17, __consumer_offsets-30, __consumer_offsets-26, __consumer_offsets-5, __consumer_offsets-38, __consumer_offsets-1, __consumer_offsets-34, __consumer_offsets-16, __consumer_offsets-45, __consumer_offsets-12, __consumer_offsets-41, __consumer_offsets-24, __consumer_offsets-20, __consumer_offsets-49, __consumer_offsets-0, __consumer_offsets-29, __consumer_offsets-25, __consumer_offsets-8, __consumer_offsets-37, __consumer_offsets-4, __consumer_offsets-33, __consumer_offsets-15, __consumer_offsets-48, __consumer_offsets-11, __consumer_offsets-44, __consumer_offsets-23, __consumer_offsets-19, __consumer_offsets-32, __consumer_offsets-28, __consumer_offsets-7, __consumer_offsets-40, __consumer_offsets-3, __consumer_offsets-36, __consumer_offsets-47, __consumer_offsets-14, __consumer_offsets-43, __consumer_offsets-10, __consumer_offsets-22, __consumer_offsets-18, __consumer_offsets-31, __consumer_offsets-27, __consumer_offsets-39, __consumer_offsets-6, __consumer_offsets-35, __consumer_offsets-2) (kafka.server.ReplicaFetcherManager)
[2026-06-18 17:24:47,658] INFO [LogLoader partition=__consumer_offsets-13, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,659] INFO Created log for partition __consumer_offsets-13 in C:\tmp\kraft-broker-logs\__consumer_offsets-13 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,669] INFO [Partition __consumer_offsets-13 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-13 (kafka.cluster.Partition)
[2026-06-18 17:24:47,670] INFO [Partition __consumer_offsets-13 broker=2] Log loaded for partition __consumer_offsets-13 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,678] INFO [LogLoader partition=__consumer_offsets-46, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,679] INFO Created log for partition __consumer_offsets-46 in C:\tmp\kraft-broker-logs\__consumer_offsets-46 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,679] INFO [Partition __consumer_offsets-46 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-46 (kafka.cluster.Partition)
[2026-06-18 17:24:47,679] INFO [Partition __consumer_offsets-46 broker=2] Log loaded for partition __consumer_offsets-46 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,686] INFO [LogLoader partition=__consumer_offsets-9, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,687] INFO Created log for partition __consumer_offsets-9 in C:\tmp\kraft-broker-logs\__consumer_offsets-9 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,687] INFO [Partition __consumer_offsets-9 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-9 (kafka.cluster.Partition)
[2026-06-18 17:24:47,687] INFO [Partition __consumer_offsets-9 broker=2] Log loaded for partition __consumer_offsets-9 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,694] INFO [LogLoader partition=__consumer_offsets-42, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,696] INFO Created log for partition __consumer_offsets-42 in C:\tmp\kraft-broker-logs\__consumer_offsets-42 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,697] INFO [Partition __consumer_offsets-42 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-42 (kafka.cluster.Partition)
[2026-06-18 17:24:47,697] INFO [Partition __consumer_offsets-42 broker=2] Log loaded for partition __consumer_offsets-42 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,703] INFO [LogLoader partition=__consumer_offsets-21, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,704] INFO Created log for partition __consumer_offsets-21 in C:\tmp\kraft-broker-logs\__consumer_offsets-21 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,704] INFO [Partition __consumer_offsets-21 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-21 (kafka.cluster.Partition)
[2026-06-18 17:24:47,706] INFO [Partition __consumer_offsets-21 broker=2] Log loaded for partition __consumer_offsets-21 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,713] INFO [LogLoader partition=__consumer_offsets-17, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,714] INFO Created log for partition __consumer_offsets-17 in C:\tmp\kraft-broker-logs\__consumer_offsets-17 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,715] INFO [Partition __consumer_offsets-17 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-17 (kafka.cluster.Partition)
[2026-06-18 17:24:47,715] INFO [Partition __consumer_offsets-17 broker=2] Log loaded for partition __consumer_offsets-17 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,727] INFO [LogLoader partition=__consumer_offsets-30, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,727] INFO Created log for partition __consumer_offsets-30 in C:\tmp\kraft-broker-logs\__consumer_offsets-30 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,728] INFO [Partition __consumer_offsets-30 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-30 (kafka.cluster.Partition)
[2026-06-18 17:24:47,729] INFO [Partition __consumer_offsets-30 broker=2] Log loaded for partition __consumer_offsets-30 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,739] INFO [LogLoader partition=__consumer_offsets-26, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,742] INFO Created log for partition __consumer_offsets-26 in C:\tmp\kraft-broker-logs\__consumer_offsets-26 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,742] INFO [Partition __consumer_offsets-26 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-26 (kafka.cluster.Partition)
[2026-06-18 17:24:47,742] INFO [Partition __consumer_offsets-26 broker=2] Log loaded for partition __consumer_offsets-26 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,753] INFO [LogLoader partition=__consumer_offsets-5, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,756] INFO Created log for partition __consumer_offsets-5 in C:\tmp\kraft-broker-logs\__consumer_offsets-5 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,756] INFO [Partition __consumer_offsets-5 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-5 (kafka.cluster.Partition)
[2026-06-18 17:24:47,756] INFO [Partition __consumer_offsets-5 broker=2] Log loaded for partition __consumer_offsets-5 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,768] INFO [LogLoader partition=__consumer_offsets-38, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,770] INFO Created log for partition __consumer_offsets-38 in C:\tmp\kraft-broker-logs\__consumer_offsets-38 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,770] INFO [Partition __consumer_offsets-38 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-38 (kafka.cluster.Partition)
[2026-06-18 17:24:47,771] INFO [Partition __consumer_offsets-38 broker=2] Log loaded for partition __consumer_offsets-38 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,781] INFO [LogLoader partition=__consumer_offsets-1, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,782] INFO Created log for partition __consumer_offsets-1 in C:\tmp\kraft-broker-logs\__consumer_offsets-1 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,783] INFO [Partition __consumer_offsets-1 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-1 (kafka.cluster.Partition)
[2026-06-18 17:24:47,783] INFO [Partition __consumer_offsets-1 broker=2] Log loaded for partition __consumer_offsets-1 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,791] INFO [LogLoader partition=__consumer_offsets-34, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,792] INFO Created log for partition __consumer_offsets-34 in C:\tmp\kraft-broker-logs\__consumer_offsets-34 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,793] INFO [Partition __consumer_offsets-34 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-34 (kafka.cluster.Partition)
[2026-06-18 17:24:47,793] INFO [Partition __consumer_offsets-34 broker=2] Log loaded for partition __consumer_offsets-34 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,803] INFO [LogLoader partition=__consumer_offsets-16, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,804] INFO Created log for partition __consumer_offsets-16 in C:\tmp\kraft-broker-logs\__consumer_offsets-16 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,804] INFO [Partition __consumer_offsets-16 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-16 (kafka.cluster.Partition)
[2026-06-18 17:24:47,804] INFO [Partition __consumer_offsets-16 broker=2] Log loaded for partition __consumer_offsets-16 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,815] INFO [LogLoader partition=__consumer_offsets-45, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,816] INFO Created log for partition __consumer_offsets-45 in C:\tmp\kraft-broker-logs\__consumer_offsets-45 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,816] INFO [Partition __consumer_offsets-45 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-45 (kafka.cluster.Partition)
[2026-06-18 17:24:47,817] INFO [Partition __consumer_offsets-45 broker=2] Log loaded for partition __consumer_offsets-45 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,826] INFO [LogLoader partition=__consumer_offsets-12, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,826] INFO Created log for partition __consumer_offsets-12 in C:\tmp\kraft-broker-logs\__consumer_offsets-12 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,828] INFO [Partition __consumer_offsets-12 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-12 (kafka.cluster.Partition)
[2026-06-18 17:24:47,828] INFO [Partition __consumer_offsets-12 broker=2] Log loaded for partition __consumer_offsets-12 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,838] INFO [LogLoader partition=__consumer_offsets-41, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,840] INFO Created log for partition __consumer_offsets-41 in C:\tmp\kraft-broker-logs\__consumer_offsets-41 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,840] INFO [Partition __consumer_offsets-41 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-41 (kafka.cluster.Partition)
[2026-06-18 17:24:47,841] INFO [Partition __consumer_offsets-41 broker=2] Log loaded for partition __consumer_offsets-41 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,850] INFO [LogLoader partition=__consumer_offsets-24, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,851] INFO Created log for partition __consumer_offsets-24 in C:\tmp\kraft-broker-logs\__consumer_offsets-24 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,852] INFO [Partition __consumer_offsets-24 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-24 (kafka.cluster.Partition)
[2026-06-18 17:24:47,852] INFO [Partition __consumer_offsets-24 broker=2] Log loaded for partition __consumer_offsets-24 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,861] INFO [LogLoader partition=__consumer_offsets-20, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,862] INFO Created log for partition __consumer_offsets-20 in C:\tmp\kraft-broker-logs\__consumer_offsets-20 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,863] INFO [Partition __consumer_offsets-20 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-20 (kafka.cluster.Partition)
[2026-06-18 17:24:47,863] INFO [Partition __consumer_offsets-20 broker=2] Log loaded for partition __consumer_offsets-20 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,876] INFO [LogLoader partition=__consumer_offsets-49, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,879] INFO Created log for partition __consumer_offsets-49 in C:\tmp\kraft-broker-logs\__consumer_offsets-49 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,879] INFO [Partition __consumer_offsets-49 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-49 (kafka.cluster.Partition)
[2026-06-18 17:24:47,880] INFO [Partition __consumer_offsets-49 broker=2] Log loaded for partition __consumer_offsets-49 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,899] INFO [LogLoader partition=__consumer_offsets-0, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,900] INFO Created log for partition __consumer_offsets-0 in C:\tmp\kraft-broker-logs\__consumer_offsets-0 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,901] INFO [Partition __consumer_offsets-0 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,902] INFO [Partition __consumer_offsets-0 broker=2] Log loaded for partition __consumer_offsets-0 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,922] INFO [LogLoader partition=__consumer_offsets-29, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,926] INFO Created log for partition __consumer_offsets-29 in C:\tmp\kraft-broker-logs\__consumer_offsets-29 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,927] INFO [Partition __consumer_offsets-29 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-29 (kafka.cluster.Partition)
[2026-06-18 17:24:47,928] INFO [Partition __consumer_offsets-29 broker=2] Log loaded for partition __consumer_offsets-29 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,949] INFO [LogLoader partition=__consumer_offsets-25, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,950] INFO Created log for partition __consumer_offsets-25 in C:\tmp\kraft-broker-logs\__consumer_offsets-25 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,952] INFO [Partition __consumer_offsets-25 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-25 (kafka.cluster.Partition)
[2026-06-18 17:24:47,952] INFO [Partition __consumer_offsets-25 broker=2] Log loaded for partition __consumer_offsets-25 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:47,975] INFO [LogLoader partition=__consumer_offsets-8, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:47,984] INFO Created log for partition __consumer_offsets-8 in C:\tmp\kraft-broker-logs\__consumer_offsets-8 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:47,987] INFO [Partition __consumer_offsets-8 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-8 (kafka.cluster.Partition)
[2026-06-18 17:24:47,988] INFO [Partition __consumer_offsets-8 broker=2] Log loaded for partition __consumer_offsets-8 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,037] INFO [LogLoader partition=__consumer_offsets-37, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,042] INFO Created log for partition __consumer_offsets-37 in C:\tmp\kraft-broker-logs\__consumer_offsets-37 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,044] INFO [Partition __consumer_offsets-37 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-37 (kafka.cluster.Partition)
[2026-06-18 17:24:48,044] INFO [Partition __consumer_offsets-37 broker=2] Log loaded for partition __consumer_offsets-37 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,068] INFO [LogLoader partition=__consumer_offsets-4, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,071] INFO Created log for partition __consumer_offsets-4 in C:\tmp\kraft-broker-logs\__consumer_offsets-4 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,072] INFO [Partition __consumer_offsets-4 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-4 (kafka.cluster.Partition)
[2026-06-18 17:24:48,073] INFO [Partition __consumer_offsets-4 broker=2] Log loaded for partition __consumer_offsets-4 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,101] INFO [LogLoader partition=__consumer_offsets-33, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,105] INFO Created log for partition __consumer_offsets-33 in C:\tmp\kraft-broker-logs\__consumer_offsets-33 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,107] INFO [Partition __consumer_offsets-33 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-33 (kafka.cluster.Partition)
[2026-06-18 17:24:48,108] INFO [Partition __consumer_offsets-33 broker=2] Log loaded for partition __consumer_offsets-33 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,123] INFO [LogLoader partition=__consumer_offsets-15, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,124] INFO Created log for partition __consumer_offsets-15 in C:\tmp\kraft-broker-logs\__consumer_offsets-15 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,125] INFO [Partition __consumer_offsets-15 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-15 (kafka.cluster.Partition)
[2026-06-18 17:24:48,125] INFO [Partition __consumer_offsets-15 broker=2] Log loaded for partition __consumer_offsets-15 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,137] INFO [LogLoader partition=__consumer_offsets-48, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,139] INFO Created log for partition __consumer_offsets-48 in C:\tmp\kraft-broker-logs\__consumer_offsets-48 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,139] INFO [Partition __consumer_offsets-48 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-48 (kafka.cluster.Partition)
[2026-06-18 17:24:48,140] INFO [Partition __consumer_offsets-48 broker=2] Log loaded for partition __consumer_offsets-48 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,151] INFO [LogLoader partition=__consumer_offsets-11, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,152] INFO Created log for partition __consumer_offsets-11 in C:\tmp\kraft-broker-logs\__consumer_offsets-11 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,152] INFO [Partition __consumer_offsets-11 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-11 (kafka.cluster.Partition)
[2026-06-18 17:24:48,153] INFO [Partition __consumer_offsets-11 broker=2] Log loaded for partition __consumer_offsets-11 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,163] INFO [LogLoader partition=__consumer_offsets-44, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,164] INFO Created log for partition __consumer_offsets-44 in C:\tmp\kraft-broker-logs\__consumer_offsets-44 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,165] INFO [Partition __consumer_offsets-44 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-44 (kafka.cluster.Partition)
[2026-06-18 17:24:48,165] INFO [Partition __consumer_offsets-44 broker=2] Log loaded for partition __consumer_offsets-44 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,174] INFO [LogLoader partition=__consumer_offsets-23, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,174] INFO Created log for partition __consumer_offsets-23 in C:\tmp\kraft-broker-logs\__consumer_offsets-23 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,175] INFO [Partition __consumer_offsets-23 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-23 (kafka.cluster.Partition)
[2026-06-18 17:24:48,175] INFO [Partition __consumer_offsets-23 broker=2] Log loaded for partition __consumer_offsets-23 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,184] INFO [LogLoader partition=__consumer_offsets-19, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,185] INFO Created log for partition __consumer_offsets-19 in C:\tmp\kraft-broker-logs\__consumer_offsets-19 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,186] INFO [Partition __consumer_offsets-19 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-19 (kafka.cluster.Partition)
[2026-06-18 17:24:48,186] INFO [Partition __consumer_offsets-19 broker=2] Log loaded for partition __consumer_offsets-19 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,194] INFO [LogLoader partition=__consumer_offsets-32, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,195] INFO Created log for partition __consumer_offsets-32 in C:\tmp\kraft-broker-logs\__consumer_offsets-32 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,195] INFO [Partition __consumer_offsets-32 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-32 (kafka.cluster.Partition)
[2026-06-18 17:24:48,196] INFO [Partition __consumer_offsets-32 broker=2] Log loaded for partition __consumer_offsets-32 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,203] INFO [LogLoader partition=__consumer_offsets-28, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,204] INFO Created log for partition __consumer_offsets-28 in C:\tmp\kraft-broker-logs\__consumer_offsets-28 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,204] INFO [Partition __consumer_offsets-28 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-28 (kafka.cluster.Partition)
[2026-06-18 17:24:48,204] INFO [Partition __consumer_offsets-28 broker=2] Log loaded for partition __consumer_offsets-28 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,213] INFO [LogLoader partition=__consumer_offsets-7, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,213] INFO Created log for partition __consumer_offsets-7 in C:\tmp\kraft-broker-logs\__consumer_offsets-7 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,213] INFO [Partition __consumer_offsets-7 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-7 (kafka.cluster.Partition)
[2026-06-18 17:24:48,213] INFO [Partition __consumer_offsets-7 broker=2] Log loaded for partition __consumer_offsets-7 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,222] INFO [LogLoader partition=__consumer_offsets-40, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,223] INFO Created log for partition __consumer_offsets-40 in C:\tmp\kraft-broker-logs\__consumer_offsets-40 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,223] INFO [Partition __consumer_offsets-40 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-40 (kafka.cluster.Partition)
[2026-06-18 17:24:48,224] INFO [Partition __consumer_offsets-40 broker=2] Log loaded for partition __consumer_offsets-40 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,232] INFO [LogLoader partition=__consumer_offsets-3, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,233] INFO Created log for partition __consumer_offsets-3 in C:\tmp\kraft-broker-logs\__consumer_offsets-3 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,234] INFO [Partition __consumer_offsets-3 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-3 (kafka.cluster.Partition)
[2026-06-18 17:24:48,234] INFO [Partition __consumer_offsets-3 broker=2] Log loaded for partition __consumer_offsets-3 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,242] INFO [LogLoader partition=__consumer_offsets-36, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,243] INFO Created log for partition __consumer_offsets-36 in C:\tmp\kraft-broker-logs\__consumer_offsets-36 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,244] INFO [Partition __consumer_offsets-36 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-36 (kafka.cluster.Partition)
[2026-06-18 17:24:48,244] INFO [Partition __consumer_offsets-36 broker=2] Log loaded for partition __consumer_offsets-36 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,254] INFO [LogLoader partition=__consumer_offsets-47, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,254] INFO Created log for partition __consumer_offsets-47 in C:\tmp\kraft-broker-logs\__consumer_offsets-47 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,254] INFO [Partition __consumer_offsets-47 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-47 (kafka.cluster.Partition)
[2026-06-18 17:24:48,254] INFO [Partition __consumer_offsets-47 broker=2] Log loaded for partition __consumer_offsets-47 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,264] INFO [LogLoader partition=__consumer_offsets-14, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,265] INFO Created log for partition __consumer_offsets-14 in C:\tmp\kraft-broker-logs\__consumer_offsets-14 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,265] INFO [Partition __consumer_offsets-14 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-14 (kafka.cluster.Partition)
[2026-06-18 17:24:48,266] INFO [Partition __consumer_offsets-14 broker=2] Log loaded for partition __consumer_offsets-14 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,285] INFO [LogLoader partition=__consumer_offsets-43, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,288] INFO Created log for partition __consumer_offsets-43 in C:\tmp\kraft-broker-logs\__consumer_offsets-43 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,289] INFO [Partition __consumer_offsets-43 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-43 (kafka.cluster.Partition)
[2026-06-18 17:24:48,290] INFO [Partition __consumer_offsets-43 broker=2] Log loaded for partition __consumer_offsets-43 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,309] INFO [LogLoader partition=__consumer_offsets-10, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,311] INFO Created log for partition __consumer_offsets-10 in C:\tmp\kraft-broker-logs\__consumer_offsets-10 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,312] INFO [Partition __consumer_offsets-10 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-10 (kafka.cluster.Partition)
[2026-06-18 17:24:48,312] INFO [Partition __consumer_offsets-10 broker=2] Log loaded for partition __consumer_offsets-10 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,337] INFO [LogLoader partition=__consumer_offsets-22, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,339] INFO Created log for partition __consumer_offsets-22 in C:\tmp\kraft-broker-logs\__consumer_offsets-22 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,340] INFO [Partition __consumer_offsets-22 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-22 (kafka.cluster.Partition)
[2026-06-18 17:24:48,341] INFO [Partition __consumer_offsets-22 broker=2] Log loaded for partition __consumer_offsets-22 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,371] INFO [LogLoader partition=__consumer_offsets-18, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,376] INFO Created log for partition __consumer_offsets-18 in C:\tmp\kraft-broker-logs\__consumer_offsets-18 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,377] INFO [Partition __consumer_offsets-18 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-18 (kafka.cluster.Partition)
[2026-06-18 17:24:48,378] INFO [Partition __consumer_offsets-18 broker=2] Log loaded for partition __consumer_offsets-18 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,413] INFO [LogLoader partition=__consumer_offsets-31, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,417] INFO Created log for partition __consumer_offsets-31 in C:\tmp\kraft-broker-logs\__consumer_offsets-31 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,418] INFO [Partition __consumer_offsets-31 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-31 (kafka.cluster.Partition)
[2026-06-18 17:24:48,419] INFO [Partition __consumer_offsets-31 broker=2] Log loaded for partition __consumer_offsets-31 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,448] INFO [LogLoader partition=__consumer_offsets-27, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,452] INFO Created log for partition __consumer_offsets-27 in C:\tmp\kraft-broker-logs\__consumer_offsets-27 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,453] INFO [Partition __consumer_offsets-27 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-27 (kafka.cluster.Partition)
[2026-06-18 17:24:48,453] INFO [Partition __consumer_offsets-27 broker=2] Log loaded for partition __consumer_offsets-27 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,488] INFO [LogLoader partition=__consumer_offsets-39, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,491] INFO Created log for partition __consumer_offsets-39 in C:\tmp\kraft-broker-logs\__consumer_offsets-39 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,493] INFO [Partition __consumer_offsets-39 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-39 (kafka.cluster.Partition)
[2026-06-18 17:24:48,494] INFO [Partition __consumer_offsets-39 broker=2] Log loaded for partition __consumer_offsets-39 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,522] INFO [LogLoader partition=__consumer_offsets-6, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,524] INFO Created log for partition __consumer_offsets-6 in C:\tmp\kraft-broker-logs\__consumer_offsets-6 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,525] INFO [Partition __consumer_offsets-6 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-6 (kafka.cluster.Partition)
[2026-06-18 17:24:48,525] INFO [Partition __consumer_offsets-6 broker=2] Log loaded for partition __consumer_offsets-6 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,534] INFO [LogLoader partition=__consumer_offsets-35, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,534] INFO Created log for partition __consumer_offsets-35 in C:\tmp\kraft-broker-logs\__consumer_offsets-35 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,535] INFO [Partition __consumer_offsets-35 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-35 (kafka.cluster.Partition)
[2026-06-18 17:24:48,535] INFO [Partition __consumer_offsets-35 broker=2] Log loaded for partition __consumer_offsets-35 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,543] INFO [LogLoader partition=__consumer_offsets-2, dir=C:\tmp\kraft-broker-logs] Loading producer state till offset 0 (org.apache.kafka.storage.internals.log.UnifiedLog)
[2026-06-18 17:24:48,543] INFO Created log for partition __consumer_offsets-2 in C:\tmp\kraft-broker-logs\__consumer_offsets-2 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600} (kafka.log.LogManager)
[2026-06-18 17:24:48,544] INFO [Partition __consumer_offsets-2 broker=2] No checkpointed highwatermark is found for partition __consumer_offsets-2 (kafka.cluster.Partition)
[2026-06-18 17:24:48,544] INFO [Partition __consumer_offsets-2 broker=2] Log loaded for partition __consumer_offsets-2 with initial high watermark 0 (kafka.cluster.Partition)
[2026-06-18 17:24:48,548] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-13 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,553] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-46 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,553] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-9 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,553] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-42 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,553] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-21 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,554] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-17 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,554] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-30 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,554] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-26 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,554] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-5 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,554] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-38 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,555] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-1 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,555] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-34 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,556] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-16 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,556] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-45 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,556] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-12 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,556] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-41 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,556] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-24 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,556] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-20 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,557] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-49 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,557] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-0 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,557] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-29 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,557] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-25 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,557] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-8 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,557] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-37 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,557] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-4 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,557] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-33 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,559] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-15 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,559] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-48 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,559] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-11 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,559] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-44 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,559] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-23 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,559] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-19 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,559] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-32 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,559] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-28 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,560] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-7 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,560] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-40 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,560] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-3 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,560] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-36 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,560] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-47 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,560] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-14 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,560] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-43 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,560] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-10 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,560] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-22 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,561] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-18 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,561] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-31 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,561] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-27 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,562] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-39 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,562] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-6 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,562] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-35 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,562] INFO [GroupCoordinator id=2] Scheduling loading of metadata from __consumer_offsets-2 with epoch 0 (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,564] INFO [DynamicConfigPublisher broker id=2] Updating topic __consumer_offsets with new configuration : compression.type -> producer,cleanup.policy -> compact,segment.bytes -> 104857600 (kafka.server.metadata.DynamicConfigPublisher)
[2026-06-18 17:24:48,581] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-30 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,581] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-42 with epoch 0 in 3ms where 3ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,581] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-28 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,581] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-13 with epoch 0 in 3ms where 3ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,581] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-15 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,581] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-14 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,581] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-44 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,582] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-43 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,582] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-22 with epoch 0 in 2ms where 2ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,582] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-36 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,582] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-26 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,582] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-27 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,582] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-33 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,582] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-40 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,583] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-7 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,583] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-6 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,583] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-23 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,583] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-38 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,583] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-10 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,584] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-4 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,584] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-17 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,584] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-32 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,584] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-9 with epoch 0 in 3ms where 3ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,584] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-25 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,584] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-49 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,584] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-5 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,585] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-16 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,585] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-20 with epoch 0 in 2ms where 2ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,585] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-2 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,585] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-3 with epoch 0 in 2ms where 2ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,585] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-1 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,585] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-45 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,585] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-11 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,585] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-24 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,585] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-48 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,587] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-31 with epoch 0 in 2ms where 2ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,587] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-8 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,587] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-47 with epoch 0 in 2ms where 2ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,587] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-39 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,587] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-19 with epoch 0 in 2ms where 2ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,588] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-21 with epoch 0 in 1ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,588] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-35 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,588] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-29 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,588] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-34 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,588] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-0 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,588] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-12 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,589] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-37 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,589] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-18 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,589] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-46 with epoch 0 in 3ms where 1ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,589] INFO [GroupCoordinator id=2] Finished loading of metadata from __consumer_offsets-41 with epoch 0 in 0ms where 0ms was spent in the scheduler. Loaded 0 records which total to 0 bytes. (org.apache.kafka.coordinator.common.runtime.CoordinatorRuntime)
[2026-06-18 17:24:48,664] INFO [GroupCoordinator id=2 topic=__consumer_offsets partition=7] Dynamic member with unknown member id joins group console-consumer-42938 in Empty state. Created a new member id console-consumer-61f5ced1-a096-4893-8996-385b16181dc0 and requesting the member to rejoin with this id. (org.apache.kafka.coordinator.group.GroupMetadataManager)
[2026-06-18 17:24:48,690] INFO [GroupCoordinator id=2 topic=__consumer_offsets partition=7] Pending dynamic member with id console-consumer-61f5ced1-a096-4893-8996-385b16181dc0 joins group console-consumer-42938 in Empty state. Adding to the group now. (org.apache.kafka.coordinator.group.GroupMetadataManager)
[2026-06-18 17:24:48,697] INFO [GroupCoordinator id=2 topic=__consumer_offsets partition=7] Preparing to rebalance group console-consumer-42938 in state PreparingRebalance with old generation 0 (reason: Adding new member console-consumer-61f5ced1-a096-4893-8996-385b16181dc0 with group instance id null; client reason: need to re-join with the given member-id: console-consumer-61f5ced1-a096-4893-8996-385b16181dc0). (org.apache.kafka.coordinator.group.GroupMetadataManager)
[2026-06-18 17:24:51,704] INFO [GroupCoordinator id=2 topic=__consumer_offsets partition=7] Stabilized group console-consumer-42938 generation 1 with 1 members. (org.apache.kafka.coordinator.group.GroupMetadataManager)
[2026-06-18 17:24:51,730] INFO [GroupCoordinator id=2 topic=__consumer_offsets partition=7] Assignment received from leader console-consumer-61f5ced1-a096-4893-8996-385b16181dc0 for group console-consumer-42938 for generation 1. The group has 1 members, 0 of which are static. (org.apache.kafka.coordinator.group.GroupMetadataManager)
[2026-06-18 17:30:31,652] INFO [GroupCoordinator id=2 topic=__consumer_offsets partition=8] Dynamic member with unknown member id joins group console-consumer-57078 in Empty state. Created a new member id console-consumer-a1ed552a-84a1-4465-9812-559a2fd070b5 and requesting the member to rejoin with this id. (org.apache.kafka.coordinator.group.GroupMetadataManager)
[2026-06-18 17:30:31,658] INFO [GroupCoordinator id=2 topic=__consumer_offsets partition=8] Pending dynamic member with id console-consumer-a1ed552a-84a1-4465-9812-559a2fd070b5 joins group console-consumer-57078 in Empty state. Adding to the group now. (org.apache.kafka.coordinator.group.GroupMetadataManager)
[2026-06-18 17:30:31,659] INFO [GroupCoordinator id=2 topic=__consumer_offsets partition=8] Preparing to rebalance group console-consumer-57078 in state PreparingRebalance with old generation 0 (reason: Adding new member console-consumer-a1ed552a-84a1-4465-9812-559a2fd070b5 with group instance id null; client reason: need to re-join with the given member-id: console-consumer-a1ed552a-84a1-4465-9812-559a2fd070b5). (org.apache.kafka.coordinator.group.GroupMetadataManager)
[2026-06-18 17:30:34,659] INFO [GroupCoordinator id=2 topic=__consumer_offsets partition=8] Stabilized group console-consumer-57078 generation 1 with 1 members. (org.apache.kafka.coordinator.group.GroupMetadataManager)
[2026-06-18 17:30:34,702] INFO [GroupCoordinator id=2 topic=__consumer_offsets partition=8] Assignment received from leader console-consumer-a1ed552a-84a1-4465-9812-559a2fd070b5 for group console-consumer-57078 for generation 1. The group has 1 members, 0 of which are static. (org.apache.kafka.coordinator.group.GroupMetadataManager)
[2026-06-18 17:34:47,913] INFO [NodeToControllerChannelManager id=2 name=forwarding] Node 1 disconnected. (org.apache.kafka.clients.NetworkClient)
[2026-06-18 17:40:55,811] WARN [SocketServer listenerType=BROKER, nodeId=2] Unexpected error from /127.0.0.1 (channelId=127.0.0.1:9092-127.0.0.1:54333-2-7); closing connection (org.apache.kafka.common.network.Selector)
org.apache.kafka.common.network.InvalidReceiveException: Invalid receive (size = 1195725856 larger than 104857600)
        at org.apache.kafka.common.network.NetworkReceive.readFrom(NetworkReceive.java:95)
        at org.apache.kafka.common.network.KafkaChannel.receive(KafkaChannel.java:462)
        at org.apache.kafka.common.network.KafkaChannel.read(KafkaChannel.java:412)
        at org.apache.kafka.common.network.Selector.attemptRead(Selector.java:680)
        at org.apache.kafka.common.network.Selector.pollSelectionKeys(Selector.java:582)
        at org.apache.kafka.common.network.Selector.poll(Selector.java:486)
        at kafka.network.Processor.poll(SocketServer.scala:993)
        at kafka.network.Processor.run(SocketServer.scala:897)
        at java.base/java.lang.Thread.run(Thread.java:1474)
[2026-06-18 17:40:56,928] WARN [SocketServer listenerType=BROKER, nodeId=2] Unexpected error from /127.0.0.1 (channelId=127.0.0.1:9092-127.0.0.1:55605-0-8); closing connection (org.apache.kafka.common.network.Selector)
org.apache.kafka.common.network.InvalidReceiveException: Invalid receive (size = 1195725856 larger than 104857600)
        at org.apache.kafka.common.network.NetworkReceive.readFrom(NetworkReceive.java:95)
        at org.apache.kafka.common.network.KafkaChannel.receive(KafkaChannel.java:462)
        at org.apache.kafka.common.network.KafkaChannel.read(KafkaChannel.java:412)
        at org.apache.kafka.common.network.Selector.attemptRead(Selector.java:680)
        at org.apache.kafka.common.network.Selector.pollSelectionKeys(Selector.java:582)
        at org.apache.kafka.common.network.Selector.poll(Selector.java:486)
        at kafka.network.Processor.poll(SocketServer.scala:993)
        at kafka.network.Processor.run(SocketServer.scala:897)
        at java.base/java.lang.Thread.run(Thread.java:1474)
[2026-06-18 17:40:56,930] WARN [SocketServer listenerType=BROKER, nodeId=2] Unexpected error from /127.0.0.1 (channelId=127.0.0.1:9092-127.0.0.1:56257-1-8); closing connection (org.apache.kafka.common.network.Selector)
org.apache.kafka.common.network.InvalidReceiveException: Invalid receive (size = 1195725856 larger than 104857600)
        at org.apache.kafka.common.network.NetworkReceive.readFrom(NetworkReceive.java:95)
        at org.apache.kafka.common.network.KafkaChannel.receive(KafkaChannel.java:462)
        at org.apache.kafka.common.network.KafkaChannel.read(KafkaChannel.java:412)
        at org.apache.kafka.common.network.Selector.attemptRead(Selector.java:680)
        at org.apache.kafka.common.network.Selector.pollSelectionKeys(Selector.java:582)
        at org.apache.kafka.common.network.Selector.poll(Selector.java:486)
        at kafka.network.Processor.poll(SocketServer.scala:993)
        at kafka.network.Processor.run(SocketServer.scala:897)
        at java.base/java.lang.Thread.run(Thread.java:1474)
[2026-06-18 17:40:57,238] WARN [SocketServer listenerType=BROKER, nodeId=2] Unexpected error from /127.0.0.1 (channelId=127.0.0.1:9092-127.0.0.1:51909-2-8); closing connection (org.apache.kafka.common.network.Selector)
org.apache.kafka.common.network.InvalidReceiveException: Invalid receive (size = 1195725856 larger than 104857600)
        at org.apache.kafka.common.network.NetworkReceive.readFrom(NetworkReceive.java:95)
        at org.apache.kafka.common.network.KafkaChannel.receive(KafkaChannel.java:462)
        at org.apache.kafka.common.network.KafkaChannel.read(KafkaChannel.java:412)
        at org.apache.kafka.common.network.Selector.attemptRead(Selector.java:680)
        at org.apache.kafka.common.network.Selector.pollSelectionKeys(Selector.java:582)
        at org.apache.kafka.common.network.Selector.poll(Selector.java:486)
        at kafka.network.Processor.poll(SocketServer.scala:993)
        at kafka.network.Processor.run(SocketServer.scala:897)
        at java.base/java.lang.Thread.run(Thread.java:1474)
[2026-06-18 17:40:58,923] WARN [SocketServer listenerType=BROKER, nodeId=2] Unexpected error from /127.0.0.1 (channelId=127.0.0.1:9092-127.0.0.1:58796-0-9); closing connection (org.apache.kafka.common.network.Selector)
org.apache.kafka.common.network.InvalidReceiveException: Invalid receive (size = 1195725856 larger than 104857600)
        at org.apache.kafka.common.network.NetworkReceive.readFrom(NetworkReceive.java:95)
        at org.apache.kafka.common.network.KafkaChannel.receive(KafkaChannel.java:462)
        at org.apache.kafka.common.network.KafkaChannel.read(KafkaChannel.java:412)
        at org.apache.kafka.common.network.Selector.attemptRead(Selector.java:680)
        at org.apache.kafka.common.network.Selector.pollSelectionKeys(Selector.java:582)
        at org.apache.kafka.common.network.Selector.poll(Selector.java:486)
        at kafka.network.Processor.poll(SocketServer.scala:993)
        at kafka.network.Processor.run(SocketServer.scala:897)
        at java.base/java.lang.Thread.run(Thread.java:1474)
[2026-06-18 17:41:04,003] WARN [SocketServer listenerType=BROKER, nodeId=2] Unexpected error from /127.0.0.1 (channelId=127.0.0.1:9092-127.0.0.1:61088-1-9); closing connection (org.apache.kafka.common.network.Selector)
org.apache.kafka.common.network.InvalidReceiveException: Invalid receive (size = 1195725856 larger than 104857600)
        at org.apache.kafka.common.network.NetworkReceive.readFrom(NetworkReceive.java:95)
        at org.apache.kafka.common.network.KafkaChannel.receive(KafkaChannel.java:462)
        at org.apache.kafka.common.network.KafkaChannel.read(KafkaChannel.java:412)
        at org.apache.kafka.common.network.Selector.attemptRead(Selector.java:680)
        at org.apache.kafka.common.network.Selector.pollSelectionKeys(Selector.java:582)
        at org.apache.kafka.common.network.Selector.poll(Selector.java:486)
        at kafka.network.Processor.poll(SocketServer.scala:993)
        at kafka.network.Processor.run(SocketServer.scala:897)
        at java.base/java.lang.Thread.run(Thread.java:1474)
[2026-06-18 17:41:04,009] WARN [SocketServer listenerType=BROKER, nodeId=2] Unexpected error from /127.0.0.1 (channelId=127.0.0.1:9092-127.0.0.1:57800-2-9); closing connection (org.apache.kafka.common.network.Selector)
org.apache.kafka.common.network.InvalidReceiveException: Invalid receive (size = 1195725856 larger than 104857600)
        at org.apache.kafka.common.network.NetworkReceive.readFrom(NetworkReceive.java:95)
        at org.apache.kafka.common.network.KafkaChannel.receive(KafkaChannel.java:462)
        at org.apache.kafka.common.network.KafkaChannel.read(KafkaChannel.java:412)
        at org.apache.kafka.common.network.Selector.attemptRead(Selector.java:680)
        at org.apache.kafka.common.network.Selector.pollSelectionKeys(Selector.java:582)
        at org.apache.kafka.common.network.Selector.poll(Selector.java:486)
        at kafka.network.Processor.poll(SocketServer.scala:993)
        at kafka.network.Processor.run(SocketServer.scala:897)
        at java.base/java.lang.Thread.run(Thread.java:1474)
[2026-06-18 17:41:04,318] WARN [SocketServer listenerType=BROKER, nodeId=2] Unexpected error from /127.0.0.1 (channelId=127.0.0.1:9092-127.0.0.1:64677-0-10); closing connection (org.apache.kafka.common.network.Selector)
org.apache.kafka.common.network.InvalidReceiveException: Invalid receive (size = 1195725856 larger than 104857600)
        at org.apache.kafka.common.network.NetworkReceive.readFrom(NetworkReceive.java:95)
        at org.apache.kafka.common.network.KafkaChannel.receive(KafkaChannel.java:462)
        at org.apache.kafka.common.network.KafkaChannel.read(KafkaChannel.java:412)
        at org.apache.kafka.common.network.Selector.attemptRead(Selector.java:680)
        at org.apache.kafka.common.network.Selector.pollSelectionKeys(Selector.java:582)
        at org.apache.kafka.common.network.Selector.poll(Selector.java:486)
        at kafka.network.Processor.poll(SocketServer.scala:993)
        at kafka.network.Processor.run(SocketServer.scala:897)
        at java.base/java.lang.Thread.run(Thread.java:1474)