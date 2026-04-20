# WeatherJetPackCompApp 🌦️

Este é um projeto Android desenvolvido para fins de estudo, focado na implementação das tecnologias mais recentes e recomendadas para o ecossistema Android moderno. O objetivo principal é consultar informações meteorológicas utilizando uma interface reativa e uma arquitetura robusta.

## 🚀 Tecnologias Utilizadas

- **[Jetpack Compose](https://developer.android.com/jetpack/compose):** Toolkit moderno para construir UI nativa de forma declarativa.
- **[Hilt (Dagger)](https://developer.android.com/training/dependency-injection/hilt-android):** Biblioteca de injeção de dependências que simplifica o gerenciamento de instâncias e o ciclo de vida.
- **[KSP (Kotlin Symbol Processing)](https://kotlinlang.org/docs/ksp-overview.html):** API poderosa para análise de código em Kotlin, utilizada para acelerar ferramentas como o Hilt.
- **[ViewModel & StateFlow](https://developer.android.com/topic/libraries/architecture/viewmodel):** Gerenciamento de estado da UI consciente do ciclo de vida.
- **[Material 3](https://m3.material.io/):** A versão mais recente do design system da Google, com suporte a temas dinâmicos.
- **[Hilt Navigation Compose](https://developer.android.com/jetpack/compose/navigation):** Integração da navegação com injeção de dependências.

## 🏗️ Arquitetura (MVVM)

O projeto segue o padrão **MVVM (Model-View-ViewModel)** com uma clara separação de responsabilidades:

1.  **UI Layer (Compose):** Localizada em `screens/` e `ui/theme/`. Define como a aplicação é apresentada.
2.  **State Management (ViewModel):** Localizada em `viewmodel/`. Trata a lógica de negócio da UI e expõe o estado através de `UiState`.
3.  **Data Layer (Repository):** Localizada em `repository/`. Centraliza o acesso aos dados (API, Base de Dados, etc.).
4.  **DI Layer (Hilt):** Localizada em `di/`. Configura como os objetos são criados e injetados.

## 📁 Estrutura do Projeto

```text
app/src/main/java/com/example/weatherjetpackcompapp/
├── di/                # Módulos de Injeção de Dependências
├── model/             # Modelos de dados (Data Classes)
├── repository/        # Lógica de acesso a dados (Interfaces e Impl)
├── screens/           # Ecrãs e componentes da UI (Compose)
├── ui/theme/          # Definições de cores, tipos e tema (Material 3)
└── viewmodel/         # ViewModels e estados de UI
```

## 📝 O que estou a estudar neste projeto:

1.  **Injeção de Dependências:** Como desacoplar componentes usando o Hilt.
2.  **Fluxo de Dados Unidirecional (UDF):** Como o estado flui do ViewModel para a UI e os eventos fluem da UI para o ViewModel.
3.  **Tematização em Compose:** Implementação de cores personalizadas e suporte a Dark Mode.
4.  **Clean Architecture:** Princípios de separação de interesses para tornar o código testável e escalável.

## 🛠️ Como configurar

1.  Clona o repositório.
2.  Certifica-te de que tens o **Android Studio Ladybug** (ou superior) instalado.
3.  Sincroniza o Gradle (o projeto utiliza o sistema de `libs.versions.toml`).
4.  Executa a aplicação num emulador ou dispositivo físico.

---
Este projeto serve como base de aprendizagem para o desenvolvimento Android nativo contemporâneo.
