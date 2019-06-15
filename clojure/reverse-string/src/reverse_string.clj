(ns reverse-string)

(defn reverse-string [s]
  (let [gen (fn [s r]
              (if (empty? s)
                r
                (recur (subs s 1) (str (subs s 0 1) r))))]
    (gen s "")))
