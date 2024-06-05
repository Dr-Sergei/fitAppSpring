# fitness App with Spring-Boot
fitApp pet Project

POST REQUESTS:

    # Add a leg exercise
        curl -X POST http://localhost:8080/api/exercises/add \
        -H "Content-Type: application/json" \
        -d '{
        "name": "Squat",
        "description": "A compound exercise that targets the quadriceps, hamstrings, and glutes.",
        "muscleGroup": "Legs"
        }'

    # Add a pull exercise
        curl -X POST http://localhost:8080/api/exercises/add \
        -H "Content-Type: application/json" \
        -d '{
        "name": "Pull-Up",
        "description": "An upper-body strength exercise that targets the lats and biceps.",
        "muscleGroup": "Pull"
        }'

    # Add a push exercise
        curl -X POST http://localhost:8080/api/exercises/add \
        -H "Content-Type: application/json" \
        -d '{
        "name": "Bench Press",
        "description": "A compound exercise that targets the chest, shoulders, and triceps.",
        "muscleGroup": "Push"
        }'
