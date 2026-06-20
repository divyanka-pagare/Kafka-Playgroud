## Kafka Playground

- Started Controller
<img width="866" height="463" alt="Screenshot 2026-06-20 104057" src="https://github.com/user-attachments/assets/cccd474d-feb2-4685-8403-dc59ed7c990c" />

- Started Broker
<img width="868" height="463" alt="Screenshot 2026-06-20 104139" src="https://github.com/user-attachments/assets/a4a99e92-02f7-45ba-9dce-2db0b30fcd1d" />

- Produced Messages
- Consumed Messages
- Learned Partitions
- Multiple Partitions
- Consumer Groups

## Spring Kafka
### Producer Service

### Notification Service 

```
+------------------+
|   User Service   |
+------------------+
        |
        | Publish UserRegisteredEvent
        V
+------------------+
|      Kafka       |
| user-registered  |
+------------------+
        |
        | Consume Event
        V
+----------------------+
| Notification Service |
+----------------------+
        |
        V
 Send Welcome Email

```

- Order send successfully - Message
<img width="865" height="463" alt="Screenshot 2026-06-20 104218" src="https://github.com/user-attachments/assets/b8ee0916-58df-4b7b-908b-ec71ba20640b" />

- Welcome Email to + order
<img width="866" height="464" alt="Screenshot 2026-06-20 104255" src="https://github.com/user-attachments/assets/377afdab-d635-47df-bde2-008afe282a43" />

- Created Topic Orders
<img width="864" height="461" alt="image" src="https://github.com/user-attachments/assets/fca38565-b530-4dcb-9f35-b5bc0462be95" />







### Payment Service

Client
  |
  V
Order Service
  |
  V
Kafka Topic : orders
  |
  V
Payment Service
  |
  V
Kafka Topic : payments
  |
  V
Notification Service


### Create payments topic
bin\windows\kafka-topics.bat --create --topic payments --bootstrap-server localhost:9092 --partitions 3 --replication-factor 1

--> Created topic payments.

PS C:\kafka> bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
-->
order-created
orders
payments

<img width="866" height="464" alt="image" src="https://github.com/user-attachments/assets/33b33827-c286-4185-8c56-e74e798cbf69" />

<img width="868" height="466" alt="image" src="https://github.com/user-attachments/assets/f8472f9e-f37b-42dd-b4de-3bd4b98710b9" />


### Inventory Service

<img width="868" height="465" alt="image" src="https://github.com/user-attachments/assets/5207165d-fcb2-45fd-a68f-060da2d5bf6d" />

<img width="866" height="466" alt="image" src="https://github.com/user-attachments/assets/3dcf2b75-1800-48e1-be13-d40701b5d2dc" />


