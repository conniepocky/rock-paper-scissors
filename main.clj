(def options 
  {:rock {:name "rock" :beats :scissors}
    :paper {:name "paper" :beats :rock}
    :scissors {:name "scissors" :beats :paper}})


(prn (keys options))

(defn rps-result [p1 p2]
  (cond 
    (= p1 p2)
    :draw

    (=(get-in options [p1 :beats]) p2)
    :win

    :else
    :lose))


;;Rock Paper Scissors
(defn rock-paper-scissors []

  (println "Welcome to Rock Paper Scissors!!")

  (let [computer-choice (rand-nth (keys options))
        user-choice (keyword (read-line)) 

        result          (rps-result user-choice
                                                    computer-choice)
        message         (case result
                          :draw "draw!"
                          :win  "Well done, you win!"
                          :lose "You lost!")]

    (println "computer chose:" (get-in options [computer-choice :name]))
    (println message)))

(rock-paper-scissors)
