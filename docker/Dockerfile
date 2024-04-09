FROM maven:3.8.4-openjdk-17

WORKDIR /app
COPY . /app

RUN ./scripts/install.sh
EXPOSE 8080

CMD ["bash"]