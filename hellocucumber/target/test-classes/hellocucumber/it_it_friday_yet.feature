Feature: Est-ce vendredi aujourd'hui ?
  Tout le monde veut savoir si on est vendredi

  Scenario Outline: Vérifier si c'est vendredi
    Given Aujourd'hui c'est <day>
    When Je demande si nous sommes vendredi
    Then On devrait me répondre "<answer>"

    Examples:
      | day            | answer |
      | Vendredi         | TGIF   |
      | Dimanche         | Nope   |
      | tout le reste | Nope   |
