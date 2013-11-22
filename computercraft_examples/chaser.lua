delay = 0.2
sides = {'left','right','bottom','back'}

while (true) do
  for i=1, 4 do
      rs.setOutput(sides[i], true)
      sleep(delay)
      rs.setOutput(sides[i], false)
      sleep(delay)
  end
end
