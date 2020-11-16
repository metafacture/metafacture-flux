# metafacture-flux
Xtext-based tool support for the Metafacture Flux language

Visual Studio Code Extension
---------------------------
The project `org.metafacture.flux.vsc` provides an extension for Visual Studio Code for `flux` via the language server protocol (LSP). In the current state the extension supports auto completion, simple syntax highlighting and auto closing brackets and quotes. This project was created using the [tutorial](https://www.typefox.io/blog/building-a-vs-code-extension-with-xtext-and-the-language-server-protoco) and the corrresponding [example](lhttps://github.com/TypeFox/languageserver-example).

Start extension:

1. Install Visual Studio Code / alternative: VS Codium
2. Install Node.js (including npm)
3. Checkout metafacture-flux project
4. In metafacture-flux execute:
Unix: `./gradlew installServer`
Windows: `.\gradlew.bat installServer`
5. In org.metafacture.flux.vsc execute (tip: if you use windows, install cygwin to execute npm commands):
`npm install`
6. Open org.metafacture.flux.vsc in Visual Studio Code
7. Launch vscode extension by pressing F5 (opens new window of Visual Studio Code)
8. Open new file (file-ending .flux) or open existing fix-file
