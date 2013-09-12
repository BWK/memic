

;clojure comment

;everything is enclosed in its own block of parens
;has functions as first-class data types
(def vowel? (set "aeiou"))

;easy to define functions v variables
(defn pig-latin [word]
;has a lot of built in shortcuts for string manipulation/etc
  (let [first-letter (first word)]
    (if (vowel? first-letter)
      (str word "ay")
      (str (subs word 1) first-letter "ay")
    )
  )

;can be so clean
 (println (pig-latin "red"))
 (println (pig-latin "orange"))
