bottomMon = peripheral.wrap("bottom")
bottomMon.setTextScale(2)
topMon = peripheral.wrap("top")
topMon.setTextScale(5)
topMon.setBackgroundColor(colors.white)
topMon.setTextColor(colors.green)

bottomMon.clear()
bottomMon.write("Approx Minecraft Time")

hour = 8 -- dawn
min = 0

while true do
  min = min + 1
  if min > 59 then
    min = 0
    hour = hour + 1
  end
  if hour > 23 then
    hour = 0
  end
  topMon.clear()
  topMon.setCursorPos(4, 2)
  msg = string.format("%02d:%02d", hour, min)
  topMon.write(msg)
  sleep(1)
end
