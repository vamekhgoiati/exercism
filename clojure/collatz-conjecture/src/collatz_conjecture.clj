(ns collatz-conjecture)

(defn collatz [num]
  (if (< num 1)
    (throw (Exception. "Invalid argument"))
    (let [collat (fn [cnt num]
                   (if (= 1 num)
                     cnt
                     (if (odd? num)
                       (recur (inc cnt)  (inc (* 3 num)))
                       (recur (inc cnt) (/ num 2)))))]
      (collat 0 num))))
