﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/Scenarios/R_D_A_Ambush2.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>39</x>
        <y>247</y>
        <position>
          <x>39</x>
          <y>247</y>
        </position>
        <center>
          <x>165.5</x>
          <y>351.5</y>
        </center>
        <min>
          <x>39</x>
          <y>247</y>
        </min>
        <max>
          <x>292</x>
          <y>456</y>
        </max>
        <width>253</width>
        <height>209</height>
        <size>
          <x>253</x>
          <y>209</y>
        </size>
        <xMin>39</xMin>
        <yMin>247</yMin>
        <xMax>292</xMax>
        <yMax>456</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You hear a voice bellowing from your radio: "We're going to cut open your heads and eat your brains!"

Several raider vehicles move in to engage you.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="EnableWarZone">
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
              <Chance>3</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Territory</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Prepare for a fight!</Name>
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
                <x>241</x>
                <y>127</y>
                <position>
                  <x>241</x>
                  <y>127</y>
                </position>
                <center>
                  <x>246</x>
                  <y>132</y>
                </center>
                <min>
                  <x>241</x>
                  <y>127</y>
                </min>
                <max>
                  <x>251</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>241</xMin>
                <yMin>127</yMin>
                <xMax>251</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>2</ToDialog>
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
                <x>241</x>
                <y>145</y>
                <position>
                  <x>241</x>
                  <y>145</y>
                </position>
                <center>
                  <x>246</x>
                  <y>150</y>
                </center>
                <min>
                  <x>241</x>
                  <y>145</y>
                </min>
                <max>
                  <x>251</x>
                  <y>155</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>241</xMin>
                <yMin>145</yMin>
                <xMax>251</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Supercharge engines to escape! [#]</Name>
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
                <x>241</x>
                <y>189</y>
                <position>
                  <x>241</x>
                  <y>189</y>
                </position>
                <center>
                  <x>246</x>
                  <y>194</y>
                </center>
                <min>
                  <x>241</x>
                  <y>189</y>
                </min>
                <max>
                  <x>251</x>
                  <y>199</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>241</xMin>
                <yMin>189</yMin>
                <xMax>251</xMax>
                <yMax>199</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>"Oh yeah?!"</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>41</x>
        <y>569</y>
        <position>
          <x>41</x>
          <y>569</y>
        </position>
        <center>
          <x>116</x>
          <y>619</y>
        </center>
        <min>
          <x>41</x>
          <y>569</y>
        </min>
        <max>
          <x>191</x>
          <y>669</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>41</xMin>
        <yMin>569</yMin>
        <xMax>191</xMax>
        <yMax>669</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]

Looks like your brains are safe for now.</Text>
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
        <x>767</x>
        <y>179</y>
        <position>
          <x>767</x>
          <y>179</y>
        </position>
        <center>
          <x>845.5</x>
          <y>229</y>
        </center>
        <min>
          <x>767</x>
          <y>179</y>
        </min>
        <max>
          <x>924</x>
          <y>279</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>767</xMin>
        <yMin>179</yMin>
        <xMax>924</xMax>
        <yMax>279</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Your supercharged engines leave the raider vehicles far behind you!</Text>
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
        <x>775</x>
        <y>299</y>
        <position>
          <x>775</x>
          <y>299</y>
        </position>
        <center>
          <x>850</x>
          <y>363.455078</y>
        </center>
        <min>
          <x>775</x>
          <y>299</y>
        </min>
        <max>
          <x>925</x>
          <y>427.910156</y>
        </max>
        <width>150</width>
        <height>128.910156</height>
        <size>
          <x>150</x>
          <y>128.910156</y>
        </size>
        <xMin>775</xMin>
        <yMin>299</yMin>
        <xMax>925</xMax>
        <yMax>427.910156</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Despite your supercharged engines, the raiders manage to catch up your convoy.

A fight is inevitable.</Text>
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
              <enemyType>Raiders</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>395</x>
        <y>412</y>
        <position>
          <x>395</x>
          <y>412</y>
        </position>
        <center>
          <x>523</x>
          <y>506.5</y>
        </center>
        <min>
          <x>395</x>
          <y>412</y>
        </min>
        <max>
          <x>651</x>
          <y>601</y>
        </max>
        <width>256</width>
        <height>189</height>
        <size>
          <x>256</x>
          <y>189</y>
        </size>
        <xMin>395</xMin>
        <yMin>412</yMin>
        <xMax>651</xMax>
        <yMax>601</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Yeah!"</Text>
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
              <enemyType>Raiders</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Fine, prepare to fight.</Name>
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
                <x>244</x>
                <y>109</y>
                <position>
                  <x>244</x>
                  <y>109</y>
                </position>
                <center>
                  <x>249</x>
                  <y>114</y>
                </center>
                <min>
                  <x>244</x>
                  <y>109</y>
                </min>
                <max>
                  <x>254</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>244</xMin>
                <yMin>109</yMin>
                <xMax>254</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>2</ToDialog>
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
                <x>244</x>
                <y>127</y>
                <position>
                  <x>244</x>
                  <y>127</y>
                </position>
                <center>
                  <x>249</x>
                  <y>132</y>
                </center>
                <min>
                  <x>244</x>
                  <y>127</y>
                </min>
                <max>
                  <x>254</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>244</xMin>
                <yMin>127</yMin>
                <xMax>254</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Supercharge engines to escape! [#]</Name>
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
                <x>244</x>
                <y>171</y>
                <position>
                  <x>244</x>
                  <y>171</y>
                </position>
                <center>
                  <x>249</x>
                  <y>176</y>
                </center>
                <min>
                  <x>244</x>
                  <y>171</y>
                </min>
                <max>
                  <x>254</x>
                  <y>181</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>244</xMin>
                <yMin>171</yMin>
                <xMax>254</xMax>
                <yMax>181</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>"Oh yeaaah?!"</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>401</x>
        <y>613</y>
        <position>
          <x>401</x>
          <y>613</y>
        </position>
        <center>
          <x>529</x>
          <y>707.5</y>
        </center>
        <min>
          <x>401</x>
          <y>613</y>
        </min>
        <max>
          <x>657</x>
          <y>802</y>
        </max>
        <width>256</width>
        <height>189</height>
        <size>
          <x>256</x>
          <y>189</y>
        </size>
        <xMin>401</xMin>
        <yMin>613</yMin>
        <xMax>657</xMax>
        <yMax>802</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>".... yeah!"</Text>
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
              <enemyType>Raiders</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Right, prepare to fight!</Name>
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
                <x>244</x>
                <y>109</y>
                <position>
                  <x>244</x>
                  <y>109</y>
                </position>
                <center>
                  <x>249</x>
                  <y>114</y>
                </center>
                <min>
                  <x>244</x>
                  <y>109</y>
                </min>
                <max>
                  <x>254</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>244</xMin>
                <yMin>109</yMin>
                <xMax>254</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>3</ToDialog>
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
                <x>244</x>
                <y>127</y>
                <position>
                  <x>244</x>
                  <y>127</y>
                </position>
                <center>
                  <x>249</x>
                  <y>132</y>
                </center>
                <min>
                  <x>244</x>
                  <y>127</y>
                </min>
                <max>
                  <x>254</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>244</xMin>
                <yMin>127</yMin>
                <xMax>254</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Supercharge engines to escape! [#]</Name>
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
                <x>244</x>
                <y>171</y>
                <position>
                  <x>244</x>
                  <y>171</y>
                </position>
                <center>
                  <x>249</x>
                  <y>176</y>
                </center>
                <min>
                  <x>244</x>
                  <y>171</y>
                </min>
                <max>
                  <x>254</x>
                  <y>181</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>244</xMin>
                <yMin>171</yMin>
                <xMax>254</xMax>
                <yMax>181</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>"Oh yeah?!"</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>R_D_A_Ambush2</Name>
</Scenario>