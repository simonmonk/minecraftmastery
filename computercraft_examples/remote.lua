rednet.open("left")
while true do
  if (rs.getInput("right")) then
    rednet.broadcast("on")
  else
    rednet.broadcast("off")
  end
  sleep(0.1)
end
