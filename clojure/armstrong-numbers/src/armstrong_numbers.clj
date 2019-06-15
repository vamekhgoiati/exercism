(ns armstrong-numbers)
;; power fn
(defn pow [x n]
  (reduce * (repeat n x)))

;; exponent fn
(defn exp [num]
  (if (zero? num)
    0
    (->> (quot num 10)
         (exp)
         (inc))))

;; generate armstrong
(defn gen [num pwr]
  (let [tst  (fn [sum curr]
               (if (zero? curr)
                 sum
                 (recur (+ sum (pow (mod curr 10) pwr)) (quot curr 10))))]
    (tst 0 num)))

(defn armstrong? [num] ;; <- arglist goes here
  ;; your code goes here
  (->> (exp num)
       (gen num)
       (= num)))
