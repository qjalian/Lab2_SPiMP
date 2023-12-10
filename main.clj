(defn split-channel [channel]

(if (seq channel)
    (let [count (first channel)
          rest  (rest channel)
          chunk (take count rest)]
      (cons (vec chunk) (split-channel (drop (+ 1 count) rest))))
    []))

(def input-channel [3, 4, 0, 2, 1, 2, 2, 4, 5])
(def result (split-channel input-channel))
(println result)
