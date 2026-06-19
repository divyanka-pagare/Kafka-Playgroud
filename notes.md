```

Your topic is configured correctly:

Topic: orders
PartitionCount: 3
ReplicationFactor: 1

Partitions:

Partition 0
Partition 1
Partition 2

```
```
What does this mean?

Think of a topic as a folder and partitions as files inside it.

orders Topic
├── Partition 0
├── Partition 1
└── Partition 2

When producers send messages:

Order-1
Order-2
Order-3
Order-4
Order-5

Kafka stores them in partitions:

Partition 0 : Order-1, Order-4
Partition 1 : Order-2, Order-5
Partition 2 : Order-3

(Actual distribution may differ.)

```

```

Why do we need partitions?

Imagine Flipkart receives:

10 Orders/sec

One partition is enough.

Now imagine:

100,000 Orders/sec

One consumer cannot process everything.

Kafka solves this:

orders
├── Partition 0
├── Partition 1
└── Partition 2

Now:

Consumer 1 -> Partition 0
Consumer 2 -> Partition 1
Consumer 3 -> Partition 2

Three consumers can work in parallel.

This is Kafka's biggest strength.
```
```
Small Interview Question

Q: Why are partitions used in Kafka?

Answer:

Partitions allow Kafka to:

Scale horizontally
Process messages in parallel
Increase throughput
Distribute load among consumers

```

