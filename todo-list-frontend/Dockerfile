# Usa un'immagine Node.js per costruire l'app
FROM node:18 AS build

# Crea una directory di lavoro
WORKDIR /app

# Copia i file di configurazione e installa le dipendenze
COPY package*.json ./
RUN npm install

# Copia il resto del codice
COPY . .

# Costruisce l'app
RUN npm run build

# Usa un'immagine Nginx per servire l'app
FROM nginx:alpine
COPY --from=build /app/build /usr/share/nginx/html
