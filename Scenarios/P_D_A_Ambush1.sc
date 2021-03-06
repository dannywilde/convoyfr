﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/P_D_A_Ambush1.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>34</x>
        <y>264</y>
        <position>
          <x>34</x>
          <y>264</y>
        </position>
        <center>
          <x>177</x>
          <y>377.5</y>
        </center>
        <min>
          <x>34</x>
          <y>264</y>
        </min>
        <max>
          <x>320</x>
          <y>491</y>
        </max>
        <width>286</width>
        <height>227</height>
        <size>
          <x>286</x>
          <y>227</y>
        </size>
        <xMin>34</xMin>
        <yMin>264</yMin>
        <xMax>320</xMax>
        <yMax>491</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>A convoy of vehicles approaches you, the one in the front is sporting a skull-and-bones flag.

Seems like a privateer raiding party, you hear them on the radio exclaiming:

"Come and get one in the yarbles, if ya have any yarbles, you eunuch jelly thou! </Text>
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
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Territory</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Prepare to fight these clowns!</Name>
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
                <x>274</x>
                <y>109</y>
                <position>
                  <x>274</x>
                  <y>109</y>
                </position>
                <center>
                  <x>279</x>
                  <y>114</y>
                </center>
                <min>
                  <x>274</x>
                  <y>109</y>
                </min>
                <max>
                  <x>284</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>274</xMin>
                <yMin>109</yMin>
                <xMax>284</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>274</x>
                <y>127</y>
                <position>
                  <x>274</x>
                  <y>127</y>
                </position>
                <center>
                  <x>279</x>
                  <y>132</y>
                </center>
                <min>
                  <x>274</x>
                  <y>127</y>
                </min>
                <max>
                  <x>284</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>274</xMin>
                <yMin>127</yMin>
                <xMax>284</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>1</amount>
              <random>true</random>
              <AmountAP>281</AmountAP>
              <AmountHP>177</AmountHP>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>274</x>
                <y>145</y>
                <position>
                  <x>274</x>
                  <y>145</y>
                </position>
                <center>
                  <x>279</x>
                  <y>150</y>
                </center>
                <min>
                  <x>274</x>
                  <y>145</y>
                </min>
                <max>
                  <x>284</x>
                  <y>155</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>274</xMin>
                <yMin>145</yMin>
                <xMax>284</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Divert course and outrun them.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>274</x>
                <y>189</y>
                <position>
                  <x>274</x>
                  <y>189</y>
                </position>
                <center>
                  <x>279</x>
                  <y>194</y>
                </center>
                <min>
                  <x>274</x>
                  <y>189</y>
                </min>
                <max>
                  <x>284</x>
                  <y>199</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>274</xMin>
                <yMin>189</yMin>
                <xMax>284</xMax>
                <yMax>199</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>274</x>
                <y>207</y>
                <position>
                  <x>274</x>
                  <y>207</y>
                </position>
                <center>
                  <x>279</x>
                  <y>212</y>
                </center>
                <min>
                  <x>274</x>
                  <y>207</y>
                </min>
                <max>
                  <x>284</x>
                  <y>217</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>274</xMin>
                <yMin>207</yMin>
                <xMax>284</xMax>
                <yMax>217</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Supercharge engines to outrun them! [#]</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>52</x>
        <y>560</y>
        <position>
          <x>52</x>
          <y>560</y>
        </position>
        <center>
          <x>127</x>
          <y>610</y>
        </center>
        <min>
          <x>52</x>
          <y>560</y>
        </min>
        <max>
          <x>202</x>
          <y>660</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>52</xMin>
        <yMin>560</yMin>
        <xMax>202</xMax>
        <yMax>660</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Take loot</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>933</x>
        <y>404</y>
        <position>
          <x>933</x>
          <y>404</y>
        </position>
        <center>
          <x>1014.5</x>
          <y>454</y>
        </center>
        <min>
          <x>933</x>
          <y>404</y>
        </min>
        <max>
          <x>1096</x>
          <y>504</y>
        </max>
        <width>163</width>
        <height>100</height>
        <size>
          <x>163</x>
          <y>100</y>
        </size>
        <xMin>933</xMin>
        <yMin>404</yMin>
        <xMax>1096</xMax>
        <yMax>504</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You've managed to escape the privateers.</Text>
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
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
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
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>531</x>
        <y>494</y>
        <position>
          <x>531</x>
          <y>494</y>
        </position>
        <center>
          <x>625.5</x>
          <y>569.6992</y>
        </center>
        <min>
          <x>531</x>
          <y>494</y>
        </min>
        <max>
          <x>720</x>
          <y>645.398438</y>
        </max>
        <width>189</width>
        <height>151.398438</height>
        <size>
          <x>189</x>
          <y>151.398438</y>
        </size>
        <xMin>531</xMin>
        <yMin>494</yMin>
        <xMax>720</xMax>
        <yMax>645.398438</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The privateers shoot your escaping convoy with something that looks like a modified cannon.

One of your vehicles suffers a hit.</Text>
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
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Territory</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Damn... turn and fight!</Name>
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
                <x>177</x>
                <y>109</y>
                <position>
                  <x>177</x>
                  <y>109</y>
                </position>
                <center>
                  <x>182</x>
                  <y>114</y>
                </center>
                <min>
                  <x>177</x>
                  <y>109</y>
                </min>
                <max>
                  <x>187</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>177</xMin>
                <yMin>109</yMin>
                <xMax>187</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
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
                <x>177</x>
                <y>127</y>
                <position>
                  <x>177</x>
                  <y>127</y>
                </position>
                <center>
                  <x>182</x>
                  <y>132</y>
                </center>
                <min>
                  <x>177</x>
                  <y>127</y>
                </min>
                <max>
                  <x>187</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>177</xMin>
                <yMin>127</yMin>
                <xMax>187</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Keep going!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>569</x>
        <y>721</y>
        <position>
          <x>569</x>
          <y>721</y>
        </position>
        <center>
          <x>647.5</x>
          <y>787.1328</y>
        </center>
        <min>
          <x>569</x>
          <y>721</y>
        </min>
        <max>
          <x>726</x>
          <y>853.2656</y>
        </max>
        <width>157</width>
        <height>132.265625</height>
        <size>
          <x>157</x>
          <y>132.265625</y>
        </size>
        <xMin>569</xMin>
        <yMin>721</yMin>
        <xMax>726</xMax>
        <yMax>853.2656</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The privateers don't show signs of giving up, repeatedly firing their modified cannon at your convoy.

There haven't been anymore hits, but you don't know how long your luck will last.</Text>
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
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Territory</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Turn and fight!</Name>
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
                <x>145</x>
                <y>109</y>
                <position>
                  <x>145</x>
                  <y>109</y>
                </position>
                <center>
                  <x>150</x>
                  <y>114</y>
                </center>
                <min>
                  <x>145</x>
                  <y>109</y>
                </min>
                <max>
                  <x>155</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>145</xMin>
                <yMin>109</yMin>
                <xMax>155</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Keep driving!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>560</x>
        <y>255</y>
        <position>
          <x>560</x>
          <y>255</y>
        </position>
        <center>
          <x>635</x>
          <y>305</y>
        </center>
        <min>
          <x>560</x>
          <y>255</y>
        </min>
        <max>
          <x>710</x>
          <y>355</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>560</xMin>
        <yMin>255</yMin>
        <xMax>710</xMax>
        <yMax>355</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The privateers supercharge their own engines and manage to catch up to your convoy, a fight is inevitable!</Text>
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
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>-1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Attack!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>495</x>
        <y>137</y>
        <position>
          <x>495</x>
          <y>137</y>
        </position>
        <center>
          <x>573.5</x>
          <y>187</y>
        </center>
        <min>
          <x>495</x>
          <y>137</y>
        </min>
        <max>
          <x>652</x>
          <y>237</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>495</xMin>
        <yMin>137</yMin>
        <xMax>652</xMax>
        <yMax>237</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Supercharging your engines proved sufficient to leave the privateers far behind.</Text>
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
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
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
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>P_D_A_Ambush1</Name>
</Scenario>