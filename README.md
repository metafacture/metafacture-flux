# metafacture-flux
Xtext-based tool support for the Metafacture Flux language

[![Build and Deploy](https://github.com/metafacture/metafacture-flux/workflows/Build%20and%20Deploy/badge.svg)](https://github.com/metafacture/metafacture-flux/actions?query=workflow%3A%22Build+and+Deploy%22)

Visual Studio Code / Codium Extension
---------------------------
The project `org.metafacture.flux.vsc` provides an extension for Visual Studio Code / Codium for `flux` via the language server protocol (LSP). In the current state the extension supports auto completion, simple syntax highlighting and auto closing brackets and quotes. This project was created using the [tutorial](https://www.typefox.io/blog/building-a-vs-code-extension-with-xtext-and-the-language-server-protocol) and the corrresponding [example](https://github.com/TypeFox/languageserver-example).

Build extension:

> [!IMPORTANT]
> There is a problem when building the extension on Windows and installing the extension on a Linux system afterwards. In some cases the Xtext Server won't start. So if you want to use the extension not only on Windows, build the extension on a Linux system or on a Linux Subsystem on Windows.

1. Install Visual Studio Code / alternative: VS Codium
2. Install Node.js (including npm)
3. Clone metafacture-flux project and change directory
`git clone https://github.com/metafacture/metafacture-flux.git`
`cd metafacture-flux`
4. In metafacture-flux execute:
Unix: `./gradlew installServer`
Windows: `.\gradlew.bat installServer`
5. In org.metafacture.flux.vsc execute (tip: if you use windows, install cygwin to execute npm commands):
`npm install`

To start the extension in development mode, follow A. To create an vsix file to install the extension permanently follow B.

A) Run in dev mode:
1. Open org.metafacture.flux.vsc in Visual Studio Code / Codium
2. Launch vscode extension by pressing F5 (opens new window of Visual Studio Code)
3. Open new file (file-ending .flux) or open existing flux-file

B) Install vsix file:
1. Install vsce: `npm install -g vsce`
2. In org.metafacture.flux.vsc execute: `vsce package`
vsce will create a vsix file in the vsc directory which can be used for installation:
3. Open VS Code / Codium
4. Click 'Extensions' section
5. Click menu bar and choose 'Install from VSIX...'
