;;Rock Paper Scissors

(prn "Welcome to Rock Paper Scissors!!")

(def options ["rock" "paper" "scissors"])

(def cp (rand-nth options))

(let [userchoice (read-line)]
  (println "You picked " userchoice " and the computer picked " cp)
  (cond (= userchoice cp)
        (println "Draw!") 

        (and (= userchoice "rock") (= cp "paper"))
          (println "You lose!")
   
        ;;meow
        (and (= userchoice "paper") (= cp "rock"))
          (println "You win!")

        (and (= userchoice "scissors") (= cp "paper"))
            (println "You win!") 
        (and (= userchoice "paper") (= cp "scissors"))
             (println "You lose!")
        (and (= userchoice "scissors") (= cp "rock"))
            (println "You lose!")
        (and (= userchoice "rock") (= cp "scissors"))
          (println "You win!")
            
))


