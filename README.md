# EDB II

Neste repositório estou deixando minhas atividades/laboratórios da disciplina de `EDB II` ofertada na `UFRN`. Separei em duas pastas, `java` e `rust`, por em alguns casos me desafiei a implementar os algoritmos também em `rust`.

# Observações

Descobri que o `rust` no modo `debug`, que é o padrão, não lida nem um pouco bem com recursões. E isso ficou claro quando percebi que o extremamente ineficiente algoritmo de ordenação `bogo sort` está sendo concluído bem mais rápido no `java`. Contudo, essa mesma afirmação não é valida para o modo `release` do `rust`.

Dito isso, para realizar os testes no `rust`, recomendo sempre:
```cmd
cargo build --release
cargo run --release
```