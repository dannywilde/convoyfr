﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/Scenarios/R_U_S_RaiderSquad.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>271</x>
        <y>36</y>
        <position>
          <x>271</x>
          <y>36</y>
        </position>
        <center>
          <x>360.5</x>
          <y>108.5</y>
        </center>
        <min>
          <x>271</x>
          <y>36</y>
        </min>
        <max>
          <x>450</x>
          <y>181</y>
        </max>
        <width>179</width>
        <height>145</height>
        <size>
          <x>179</x>
          <y>145</y>
        </size>
        <xMin>271</xMin>
        <yMin>36</yMin>
        <xMax>450</xMax>
        <yMax>181</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Your scanners pick up a strong squad of raiders ravaging this urban area.</Text>
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
              <enemyType>Raiders</enemyType>
              <difficulty>2</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Move in to engage!</Name>
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
                <x>167</x>
                <y>109</y>
                <position>
                  <x>167</x>
                  <y>109</y>
                </position>
                <center>
                  <x>172</x>
                  <y>114</y>
                </center>
                <min>
                  <x>167</x>
                  <y>109</y>
                </min>
                <max>
                  <x>177</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>167</xMin>
                <yMin>109</yMin>
                <xMax>177</xMax>
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
                <x>167</x>
                <y>127</y>
                <position>
                  <x>167</x>
                  <y>127</y>
                </position>
                <center>
                  <x>172</x>
                  <y>132</y>
                </center>
                <min>
                  <x>167</x>
                  <y>127</y>
                </min>
                <max>
                  <x>177</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>167</xMin>
                <yMin>127</yMin>
                <xMax>177</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Leave them be.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>261</x>
        <y>468</y>
        <position>
          <x>261</x>
          <y>468</y>
        </position>
        <center>
          <x>336</x>
          <y>518</y>
        </center>
        <min>
          <x>261</x>
          <y>468</y>
        </min>
        <max>
          <x>411</x>
          <y>568</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>261</xMin>
        <yMin>468</yMin>
        <xMax>411</xMax>
        <yMax>568</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>You've succesfully defeated all the raiders.

[0loot]

Sadly, they've left no survivors.</Text>
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
        <x>582</x>
        <y>94</y>
        <position>
          <x>582</x>
          <y>94</y>
        </position>
        <center>
          <x>710</x>
          <y>166.5</y>
        </center>
        <min>
          <x>582</x>
          <y>94</y>
        </min>
        <max>
          <x>838</x>
          <y>239</y>
        </max>
        <width>256</width>
        <height>145</height>
        <size>
          <x>256</x>
          <y>145</y>
        </size>
        <xMin>582</xMin>
        <yMin>94</yMin>
        <xMax>838</xMax>
        <yMax>239</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The raiders noticed your presence and start to pursue you!</Text>
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
              <difficulty>1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
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
              <Chance>3</Chance>
              <ToDialog>4</ToDialog>
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
              <Chance>2</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Supercharge engines to escape! [#]</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>581</x>
        <y>265</y>
        <position>
          <x>581</x>
          <y>265</y>
        </position>
        <center>
          <x>659.5</x>
          <y>315</y>
        </center>
        <min>
          <x>581</x>
          <y>265</y>
        </min>
        <max>
          <x>738</x>
          <y>365</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>581</xMin>
        <yMin>265</yMin>
        <xMax>738</xMax>
        <yMax>365</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You leave the area before the raiders turn their attention to you.</Text>
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
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>931</x>
        <y>100</y>
        <position>
          <x>931</x>
          <y>100</y>
        </position>
        <center>
          <x>1009.5</x>
          <y>150</y>
        </center>
        <min>
          <x>931</x>
          <y>100</y>
        </min>
        <max>
          <x>1088</x>
          <y>200</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>931</xMin>
        <yMin>100</yMin>
        <xMax>1088</xMax>
        <yMax>200</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Even though the urban area is difficult to navigate, your superior speed proves sufficient.</Text>
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
        <x>930</x>
        <y>225</y>
        <position>
          <x>930</x>
          <y>225</y>
        </position>
        <center>
          <x>1005</x>
          <y>275</y>
        </center>
        <min>
          <x>930</x>
          <y>225</y>
        </min>
        <max>
          <x>1080</x>
          <y>325</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>930</xMin>
        <yMin>225</yMin>
        <xMax>1080</xMax>
        <yMax>325</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Despite your superior speeds, the urban area is too difficult to navigate to lose the raiders.

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
              <difficulty>1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Prepare to fight.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>R_U_S_RaiderSquad</Name>
</Scenario>