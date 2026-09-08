4. README.md – Respostas às questões finais
1. Qual era o principal problema do código original?
O principal problema era a falta de organização e de clareza: nomes de variáveis genéricos (n, a, b, c), que não indicavam o que cada dado representava, e toda a lógica do programa concentrada em um único método, sem separação de responsabilidades.
2. Quais melhorias você realizou?
Renomeei as variáveis para nomes que descrevem seu significado (nomeAluno, notaPrimeiraAvaliacao, notaSegundaAvaliacao, media, situacao), extraí uma constante para o valor de aprovação (MEDIA_MINIMA_APROVACAO), dividi o programa em três métodos com responsabilidades específicas (calcularMedia, verificarSituacao e exibirResultado) e padronizei a nomenclatura e a indentação seguindo as convenções de Java.
3. Como a modularização facilitou a organização do código?
Ao separar o cálculo da média, a verificação da situação e a exibição dos resultados em métodos distintos, cada parte do código passou a ter uma única responsabilidade. Isso tornou o método main() mais curto e mais fácil de entender, além de permitir que cada método seja testado ou alterado individualmente, sem afetar as demais partes do programa.
4. Como o Git ajudou a controlar as alterações realizadas no sistema?
O Git permitiu registrar cada etapa da evolução do código por meio de commits, mantendo um histórico claro do que foi alterado e por quê. O uso de uma branch separada (melhoria-boas-praticas) possibilitou realizar as melhorias sem afetar diretamente a versão estável na branch main, e o Pull Request permitiu revisar todas as mudanças antes de integrá-las definitivamente ao projeto principal.
