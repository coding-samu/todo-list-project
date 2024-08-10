# Todo List Project

## Descrizione

Il progetto **Todo List** è un'applicazione web per la gestione delle attività quotidiane. L'applicazione permette agli utenti di aggiungere, modificare, e rimuovere attività dalla propria lista di cose da fare. È progettata per essere un'applicazione full-stack, comprendente un frontend in React e un backend basato su Java con Spring Boot. I dati sono memorizzati in un database PostgreSQL.

## Funzionalità

- **Gestione Attività**: Gli utenti possono aggiungere nuove attività, modificarle o eliminarle.
- **Interfaccia Utente Intuitiva**: L'interfaccia utente è progettata per essere semplice e facile da usare.
- **Persistenza dei Dati**: Le attività sono memorizzate in un database PostgreSQL.
- **Autenticazione e Autorizzazione**: Gli utenti possono autenticarsi e gestire le proprie attività in modo sicuro.

## Tecnologie Utilizzate

- **Frontend**: React, Nginx
- **Backend**: Java, Spring Boot
- **Database**: PostgreSQL
- **Containerizzazione**: Docker, Docker Compose

## Setup e Avvio

Per eseguire il progetto in locale, segui questi passaggi:

1. **Clona il Repository**

   ```sh
   git clone https://github.com/coding-samu/todo-list-project.git
   cd todo-list-project
   ```
2. **Configura le Immagini Docker**

Assicurati di avere Docker e Docker Compose installati sul tuo sistema. Puoi scaricarli e installarli dal sito ufficiale di Docker.

3. **Costruisci e Avvia i Servizi**

Compila il programma

```
cd todo-list-backend
./mvnw clean package -DskipTests
```

Torna nella directory principale ed esegui il comando seguente per costruire e avviare i contenitori Docker:

```sh
docker-compose up --build
```

4. Accedi all'Applicazione

Una volta avviati i servizi, l'applicazione sarà accessibile all'indirizzo:

Frontend: http://localhost:3000
Backend: http://localhost:8080

## Contribuire
Se desideri contribuire al progetto, sentiti libero di aprire una pull request o segnalare eventuali problemi. Le tue contribuzioni sono benvenute!