# OpenInApp Assignment - Listed Inc.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Architecture](#architecture)
- [Libraries Used](#libraries-used)
- [Setup and Installation](#setup-and-installation)
- [API Integration](#api-integration)
- [Screenshots](#screenshots)
- [Lessons Learned](#lessons-learned)
- [Further Improvements](#further-improvements)
- [Acknowledgements](#acknowledgements)
- [Contact](#contact)

## Project Overview
OpenInApp is a project developed to enhance user experience by ensuring that social media links open in their respective apps instead of built-in browsers. This project follows modern Android development practices, adopting a single activity architecture to ensure scalability and ease of maintenance.

## Features
- **Navigation:** Single activity architecture using Jetpack Navigation.
- **MVVM Architecture:** Ensuring separation of concerns and scalability.
- **LiveData & Coroutines:** For reactive programming and efficient background operations.
- **Graph Visualization:** Using MPAndroidChart to display data over a monthly timeframe.
- **Dual-Tab Functionality:** "Top links" and "Recent links" tabs to organize API data.
- **Greetings Feature:** Dynamic greetings based on local time to enhance user engagement.

## Architecture
The project is designed using the MVVM (Model-View-ViewModel) architecture which provides:
- **Separation of Concerns:** Each layer has a clear responsibility.
- **Testability:** Easier to write unit tests for each component.
- **Data Binding:** Automatic UI updates when underlying data changes.
- **Reactive Programming:** Using LiveData to observe changes.
- **Maintainability & Scalability:** Easier to manage and scale the application.
- **Code Reusability:** Components can be reused across the application.

## Libraries Used
- **Kotlin:** Primary language for development.
- **Jetpack Navigation:** For fragment navigation.
- **LiveData & ViewModel:** For managing UI-related data in a lifecycle-conscious way.
- **Coroutines:** For asynchronous programming.
- **MPAndroidChart:** For graph visualization.
- **MockWebServer & OkHttp Idling Resource:** For testing and API mocking.
- **SharedPreferences:** For token management.

## Setup and Installation
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/OpenInApp.git
