<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/ObjectiveScenarios/Q_CompressionCoil_ReportFail.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>84</x>
        <y>390</y>
        <center>
          <x>159.5</x>
          <y>449.5</y>
        </center>
        <width>151</width>
        <height>119</height>
        <xMin>84</xMin>
        <yMin>390</yMin>
        <xMax>235</xMax>
        <yMax>509</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Still feeling frustrated due to your failure, you spot Shanty Sands in the distance.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>65</y>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>83</y>
                <center>
                  <x>144</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>83</yMin>
                <xMax>149</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>12</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>101</y>
                <center>
                  <x>144</x>
                  <y>106</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>101</yMin>
                <xMax>149</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Head over.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>205</x>
        <y>775</y>
        <center>
          <x>280.5</x>
          <y>838.477539</y>
        </center>
        <width>151</width>
        <height>126.955078</height>
        <xMin>205</xMin>
        <yMin>775</yMin>
        <xMax>356</xMax>
        <yMax>901.9551</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>You shoot the last T.O.R.V.A.K. vehicle to smithereens and the sounds of combat die out.

Steve's vehicle, battered from the fight, approaches your convoy.

</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>65</y>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Talk to Steve.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>410</x>
        <y>37</y>
        <center>
          <x>540.5</x>
          <y>101.5</y>
        </center>
        <width>261</width>
        <height>129</height>
        <xMin>410</xMin>
        <yMin>37</yMin>
        <xMax>671</xMax>
        <yMax>166</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You drive into town and head towards Steve's office.

Upon your arrival, he steps out of the building and looks at you patiently.

</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>249</x>
                <y>65</y>
                <center>
                  <x>254</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>249</xMin>
                <yMin>65</yMin>
                <xMax>259</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Explain about your failure.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>425</x>
        <y>494</y>
        <center>
          <x>522</x>
          <y>544</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>425</xMin>
        <yMin>494</yMin>
        <xMax>619</xMax>
        <yMax>594</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>As you approach town, you hear gunfire and spot the unmistakable shapes of T.O.R.V.A.K. vehicles.

It appears they are attacking Shanty Sands!</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Torvak</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Get them!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>787</x>
        <y>132</y>
        <center>
          <x>862.5</x>
          <y>182</y>
        </center>
        <width>151</width>
        <height>100</height>
        <xMin>787</xMin>
        <yMin>132</yMin>
        <xMax>938</xMax>
        <yMax>232</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"I see, well that is rather unfortunate.

Finding that specific squad in these wastelands would be a fool's errant... so there's little point in telling you.

I can tell you've tried, so I'll uphold my part of the bargain regardless."

Steve beckons you inside his office.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCargo">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>65</y>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Thanks...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2433</x>
        <y>350</y>
        <center>
          <x>2511.5</x>
          <y>400</y>
        </center>
        <width>157</width>
        <height>100</height>
        <xMin>2433</xMin>
        <yMin>350</yMin>
        <xMax>2590</xMax>
        <yMax>450</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You return to the convoy with the Compression Coil and safely stash it in your cargo hold.

</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Time to move out!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>996</x>
        <y>315</y>
        <center>
          <x>1071.5</x>
          <y>365</y>
        </center>
        <width>151</width>
        <height>100</height>
        <xMin>996</xMin>
        <yMin>315</yMin>
        <xMax>1147</xMax>
        <yMax>415</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Steve retrieves the Compression Coil and puts it on table.

"Thanks for attempting to bring the murderers to justice... it was a valiant effort.

We'll make sure to never trust T.O.R.V.A.K. in the future.

If you ever find yourself around these parts again, you can consider yourself a friend of Shanty Sands."</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>65</y>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>14</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Thanks!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>458</x>
        <y>692</y>
        <center>
          <x>588</x>
          <y>756.5</y>
        </center>
        <width>260</width>
        <height>129</height>
        <xMin>458</xMin>
        <yMin>692</yMin>
        <xMax>718</xMax>
        <yMax>821</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"It turns out the murderers returned to Shanty Sands!

They must've been trying to erase all tracks, so they were most likely planning to track you down as well.

Luckily, they failed...

We are in your debt!"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>248</x>
                <y>65</y>
                <center>
                  <x>253</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>248</xMin>
                <yMin>65</yMin>
                <xMax>258</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>13</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>No problem.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1275</x>
        <y>771</y>
        <center>
          <x>1376.5</x>
          <y>875.5</y>
        </center>
        <width>203</width>
        <height>209</height>
        <xMin>1275</xMin>
        <yMin>771</yMin>
        <xMax>1478</xMax>
        <yMax>980</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Steve pauses and looks thoughtful for a moment.

"Actually, I have another request...

I've seen what this scum can do, and feel that I'm not making much of a difference in town.

I was wondering if you'd allow me to join your convoy?"
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>191</x>
                <y>65</y>
                <center>
                  <x>196</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>191</xMin>
                <yMin>65</yMin>
                <xMax>201</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <CarNumber>6</CarNumber>
              <Slot1>6</Slot1>
              <Slot2>17</Slot2>
              <Slot3>0</Slot3>
            </ButtonAction>
            <ButtonAction xsi:type="AddCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>191</x>
                <y>83</y>
                <center>
                  <x>196</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>191</xMin>
                <yMin>83</yMin>
                <xMax>201</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <CarNumber>10</CarNumber>
              <Slot1>5</Slot1>
              <Slot2>18</Slot2>
              <Slot3>0</Slot3>
            </ButtonAction>
            <ButtonAction xsi:type="AddCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>191</x>
                <y>101</y>
                <center>
                  <x>196</x>
                  <y>106</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>191</xMin>
                <yMin>101</yMin>
                <xMax>201</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <CarNumber>13</CarNumber>
              <Slot1>5</Slot1>
              <Slot2>17</Slot2>
              <Slot3>0</Slot3>
            </ButtonAction>
          </Actions>
          <Name>Welcome aboard!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>191</x>
                <y>145</y>
                <center>
                  <x>196</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>191</xMin>
                <yMin>145</yMin>
                <xMax>201</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>10</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>What about Shanty Sands?</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>191</x>
                <y>189</y>
                <center>
                  <x>196</x>
                  <y>194</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>191</xMin>
                <yMin>189</yMin>
                <xMax>201</xMax>
                <yMax>199</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>11</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Afraid not.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1727</x>
        <y>566</y>
        <center>
          <x>1802.5</x>
          <y>616</y>
        </center>
        <width>151</width>
        <height>100</height>
        <xMin>1727</xMin>
        <yMin>566</yMin>
        <xMax>1878</xMax>
        <yMax>666</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"That's great!

My vehicle is equipped with a rather powerful shield, which I'm sure will come in useful.

Thanks for giving me this opportunity, let's spread peace throughout these wastelands!"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>65</y>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>14</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Leave town.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1617</x>
        <y>852</y>
        <center>
          <x>1719.5</x>
          <y>934.5</y>
        </center>
        <width>205</width>
        <height>165</height>
        <xMin>1617</xMin>
        <yMin>852</yMin>
        <xMax>1822</xMax>
        <yMax>1017</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Shanty Sands has plenty of able-bodied men who should be able to defend it from harm.

I've trained them for many years and have faith in their capabilities."</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>65</y>
                <center>
                  <x>198</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>65</yMin>
                <xMax>203</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <CarNumber>6</CarNumber>
              <Slot1>6</Slot1>
              <Slot2>17</Slot2>
              <Slot3>0</Slot3>
            </ButtonAction>
            <ButtonAction xsi:type="AddCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>83</y>
                <center>
                  <x>198</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>83</yMin>
                <xMax>203</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <CarNumber>10</CarNumber>
              <Slot1>5</Slot1>
              <Slot2>18</Slot2>
              <Slot3>0</Slot3>
            </ButtonAction>
            <ButtonAction xsi:type="AddCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>101</y>
                <center>
                  <x>198</x>
                  <y>106</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>101</yMin>
                <xMax>203</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <CarNumber>13</CarNumber>
              <Slot1>5</Slot1>
              <Slot2>17</Slot2>
              <Slot3>0</Slot3>
            </ButtonAction>
          </Actions>
          <Name>Okay, join us then!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>145</y>
                <center>
                  <x>198</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>145</yMin>
                <xMax>203</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>11</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>You should stay.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1828</x>
        <y>1101</y>
        <center>
          <x>1903.5</x>
          <y>1151</y>
        </center>
        <width>151</width>
        <height>100</height>
        <xMin>1828</xMin>
        <yMin>1101</yMin>
        <xMax>1979</xMax>
        <yMax>1201</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Well, that is a pity. But I understand.

I'll continue keeping Shanty Sands safe, and wish you luck in your future endeavors."


</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>65</y>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>14</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Leave.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>422</x>
        <y>265</y>
        <center>
          <x>519</x>
          <y>315</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>422</xMin>
        <yMin>265</yMin>
        <xMax>616</xMax>
        <yMax>365</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You drive into town and head towards Steve's office.

Upon your arrival, he runs out before you have a chance to tell him about your failure to find the murderers and exclaims loudly:

"I've received word of the murderers location! There's no time to waste, I'll upload the new coordinates now.

Go get them!"



</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_CompressionCoil_TrackMurderers</nodeName>
              <nodeDiscription>You've received the new location of the T.O.R.V.A.K. murderers.

Steve still wants you to bring them to justice before he'll give you the Compression Coil.</nodeDiscription>
              <pos>Distance</pos>
              <distance>9</distance>
            </ButtonAction>
          </Actions>
          <Name>Get 'em!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>961</x>
        <y>567</y>
        <center>
          <x>1036.5</x>
          <y>631.4551</y>
        </center>
        <width>151</width>
        <height>128.910156</height>
        <xMin>961</xMin>
        <yMin>567</yMin>
        <xMax>1112</xMax>
        <yMax>695.910156</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Steve beckons you inside his office, retrieves the Compression Coil and puts it on table.

"Thanks again for trying to bring the murderers to justice.

We'll make sure to never trust T.O.R.V.A.K. in the future.

If you ever find yourself around these parts again, you can consider yourself a friend of Shanty Sands."</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCargo">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>65</y>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>14</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
            <ButtonAction xsi:type="AddCargo">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>83</y>
                <center>
                  <x>144</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>83</yMin>
                <xMax>149</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>8</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Of course.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1852</x>
        <y>340</y>
        <center>
          <x>1930.5</x>
          <y>390</y>
        </center>
        <width>157</width>
        <height>100</height>
        <xMin>1852</xMin>
        <yMin>340</yMin>
        <xMax>2009</xMax>
        <yMax>440</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You return to your convoy and stash the Compression Coil safely into your cargo hold.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_CompressionCoil_ReportFail</Name>
</Scenario>