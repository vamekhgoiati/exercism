(ns two-fer)

(defn two-fer
  ([] (two-fer "you"))
  ([name]
  ;; your code goes here
   (format "One for %s, one for me.", name)))