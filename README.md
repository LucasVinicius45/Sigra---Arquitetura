 ---
# Membros

### Irana Pereira – RM 98593

### Lucas Vinicius – RM 98480

### Mariana Melo – RM 98121

 ---

# SIGRA - Smart Grid Risk Alert 🚨⚡

**Sistema de Previsão de Falhas Elétricas com Ações Automatizadas**

---

## 📋 Descrição

O **SIGRA** (Smart Grid Risk Alert) é uma aplicação desenvolvida em **Java Spring Boot** que integra dados de sensores elétricos e APIs climáticas públicas para realizar a **previsão de falhas** na rede elétrica.

Em caso de risco elevado, o sistema executa **ações automatizadas**, como:  
✅ Notificação à Defesa Civil  
✅ Ativação de geradores industriais  
✅ Envio de alertas para usuários  

O objetivo é mitigar os impactos de **apagões** em regiões críticas, como áreas com hospitais, escolas e infraestrutura urbana essencial.

---

## 🛠️ Tecnologias Utilizadas

- Java 18
- Spring Boot 3.2
- Maven
- Lombok
- RestTemplate para consumo de APIs externas
- OpenWeatherMap API para previsão climática
- Mocki.io para simulação de sensores

---

## 🏗️ Arquitetura

**Padrão: MVC (Model-View-Controller)**

---

## Execução

- git clone https://github.com/seu-usuario/sigra.git
- Configure a chave da API (weather.api.key=SUA_API_KEY_AQUI)
- mvn clean install
- mvn spring-boot:run
- Exemplo de requisição via Postman ou navegador:
GET http://localhost:8080/risk-prediction?region=Sao Paulo




