Feature: Gestion des tâches dans l'application To-Do

  Scenario: Ajouter une tâche avec succès
    Given L'utilisateur est connecté à l'application de gestion des tâches
    When L'utilisateur ajoute une tâche intitulée "Faire les courses"
    Then La tâche "Faire les courses" doit apparaître dans la liste des tâches

  Scenario: Marquer une tâche comme terminée
    Given L'utilisateur a une tâche intitulée "Faire les courses" dans la liste
    When L'utilisateur marque la tâche "Faire les courses" comme terminée
    Then La tâche "Faire les courses" doit être marquée comme terminée

  Scenario: Supprimer une tâche
    Given L'utilisateur a une tâche intitulée "Faire les courses" dans la liste
    When L'utilisateur supprime la tâche "Faire les courses"
    Then La tâche "Faire les courses" ne doit plus apparaître dans la liste des tâches
