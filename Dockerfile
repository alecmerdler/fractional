FROM clojure:alpine

WORKDIR /usr/src/app
COPY project.clj /usr/src/app
RUN lein deps

COPY . /usr/src/app

CMD ["lein", "ring", "server"]
