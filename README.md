# 📈 StockFundApp Backend

Welcome to the backend of **StockFundApp** — a mobile-first Indian stocks and mutual funds filtering, screening, and personalized recommendation platform.

This Spring Boot application powers the APIs for intelligent stock screening, mutual fund analysis, custom screeners, and user portfolio personalization, built with scalability, security, and modularity in mind.

---

## 🧩 Core Features

- 🔍 **Stock Screener:**  
  Filter Indian stocks (NSE/BSE) by PE ratio, ROE, profit growth, market cap, debt-equity, dividend yield, beta, sector, and more.

- 📊 **Mutual Fund Screener:**  
  Filter Indian mutual funds by fund category, risk level, 1Y/3Y/5Y returns, expense ratio, fund manager history, AUM, and benchmark outperformance.

- 📝 **Smart Screeners:**  
  Save your custom filters (e.g., "Top Value Stocks Screener", "Best Midcap Funds Screener") for one-click reuse.

- 🛎️ **Watchlist and Alerts (Planned):**  
  Add stocks or funds to watchlists and receive real-time movement alerts.

- 🧠 **Personalized Recommendations (Planned):**  
  Intelligent stock/fund recommendations based on your risk profile and preferences.

- 🔐 **Authentication (Upcoming):**  
  Secure user registration, login, and JWT-based session management.

- 📚 **Educational Content (Phase 2):**  
  Invest wisely with built-in learning modules, glossary, and tutorials.

---

## 🏗️ Tech Stack

| Technology | Details |
|------------|---------|
| **Framework** | Spring Boot 3.1.x |
| **Language** | Java 17 |
| **Database** | PostgreSQL (Production) / H2 (Development) |
| **Authentication** | Spring Security + JWT (Planned) |
| **Documentation** | Swagger / OpenAPI 3 |
| **Build Tool** | Maven |
| **Architecture** | Modular Monolith |
| **Cloud-Ready** | Designed for Docker, Kubernetes (future scaling) |

---

## 📂 Project Structure

```plaintext
com.app.stockfundapp
 ├── auth/           --> User Authentication (JWT, OAuth) [Planned]
 ├── user/           --> User Profiles, Risk Settings
 ├── stocks/         --> Stocks Filtering APIs
 ├── funds/          --> Mutual Funds Filtering APIs
 ├── screeners/      --> Save/Load Custom Screeners
 ├── watchlist/      --> Watchlist & Alerts [Planned]
 ├── recommendation/ --> Smart Recommendation Engine [Planned]
 ├── education/      --> Learning content (articles, glossary) [Phase 2]
 └── common/         --> Utilities, Exception Handlers, Config
