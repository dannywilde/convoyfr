﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Radio</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/Scenarios/G_H_S_Radio Message.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>2</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>234</x>
        <y>312</y>
        <position>
          <x>234</x>
          <y>312</y>
        </position>
        <center>
          <x>329</x>
          <y>394.5</y>
        </center>
        <min>
          <x>234</x>
          <y>312</y>
        </min>
        <max>
          <x>424</x>
          <y>477</y>
        </max>
        <width>190</width>
        <height>165</height>
        <size>
          <x>190</x>
          <y>165</y>
        </size>
        <xMin>234</xMin>
        <yMin>312</yMin>
        <xMax>424</xMax>
        <yMax>477</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You hear a radio commercial from what appears to be a local group of traders, inviting any traffic to browse their goods. 

"Guaranteed to be the lowest prices in the sector!"</Text>
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
                <x>178</x>
                <y>65</y>
                <position>
                  <x>178</x>
                  <y>65</y>
                </position>
                <center>
                  <x>183</x>
                  <y>70</y>
                </center>
                <min>
                  <x>178</x>
                  <y>65</y>
                </min>
                <max>
                  <x>188</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>178</xMin>
                <yMin>65</yMin>
                <xMax>188</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>1</ToDialog>
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
                <x>178</x>
                <y>83</y>
                <position>
                  <x>178</x>
                  <y>83</y>
                </position>
                <center>
                  <x>183</x>
                  <y>88</y>
                </center>
                <min>
                  <x>178</x>
                  <y>83</y>
                </min>
                <max>
                  <x>188</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>178</xMin>
                <yMin>83</yMin>
                <xMax>188</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
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
                <x>178</x>
                <y>101</y>
                <position>
                  <x>178</x>
                  <y>101</y>
                </position>
                <center>
                  <x>183</x>
                  <y>106</y>
                </center>
                <min>
                  <x>178</x>
                  <y>101</y>
                </min>
                <max>
                  <x>188</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>178</xMin>
                <yMin>101</yMin>
                <xMax>188</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Follow the signal.</Name>
        </DialogButton>
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
          <Name>Ignore the commercial.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>643</x>
        <y>249</y>
        <position>
          <x>643</x>
          <y>249</y>
        </position>
        <center>
          <x>721.5</x>
          <y>292.0664</y>
        </center>
        <min>
          <x>643</x>
          <y>249</y>
        </min>
        <max>
          <x>800</x>
          <y>335.1328</y>
        </max>
        <width>157</width>
        <height>86.13281</height>
        <size>
          <x>157</x>
          <y>86.13281</y>
        </size>
        <xMin>643</xMin>
        <yMin>249</yMin>
        <xMax>800</xMax>
        <yMax>335.1328</yMax>
      </GraphRect>
      <Name>Battle Dialog</Name>
      <Text>Behind a hill you find a group of privateers, quickly surrounding you. It’s a trap!

"Oldest trick in the book, guv'nor!"</Text>
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
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Fight them!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>145</x>
        <y>603</y>
        <position>
          <x>145</x>
          <y>603</y>
        </position>
        <center>
          <x>290.5</x>
          <y>653.5</y>
        </center>
        <min>
          <x>145</x>
          <y>603</y>
        </min>
        <max>
          <x>436</x>
          <y>704</y>
        </max>
        <width>291</width>
        <height>101</height>
        <size>
          <x>291</x>
          <y>101</y>
        </size>
        <xMin>145</xMin>
        <yMin>603</yMin>
        <xMax>436</xMax>
        <yMax>704</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]

That's the last time you'll believe in Radio Bla-Bla.</Text>
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
                <x>173</x>
                <y>55</y>
                <position>
                  <x>173</x>
                  <y>55</y>
                </position>
                <center>
                  <x>178</x>
                  <y>60</y>
                </center>
                <min>
                  <x>173</x>
                  <y>55</y>
                </min>
                <max>
                  <x>183</x>
                  <y>65</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>173</xMin>
                <yMin>55</yMin>
                <xMax>183</xMax>
                <yMax>65</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Take loot.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>694</x>
        <y>359</y>
        <position>
          <x>694</x>
          <y>359</y>
        </position>
        <center>
          <x>769</x>
          <y>409</y>
        </center>
        <min>
          <x>694</x>
          <y>359</y>
        </min>
        <max>
          <x>844</x>
          <y>459</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>694</xMin>
        <yMin>359</yMin>
        <xMax>844</xMax>
        <yMax>459</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Behind a hill you find a group of raiders, quickly surrounding you. It’s a trap!

"Told ya dem fools would fall fer it!"</Text>
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
          <Name>Fight them!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>682</x>
        <y>494</y>
        <position>
          <x>682</x>
          <y>494</y>
        </position>
        <center>
          <x>757</x>
          <y>544</y>
        </center>
        <min>
          <x>682</x>
          <y>494</y>
        </min>
        <max>
          <x>832</x>
          <y>594</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>682</xMin>
        <yMin>494</yMin>
        <xMax>832</xMax>
        <yMax>594</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Behind a hill you find a group of T.O.R.V.A.K. vehicles.

"Probability of attracting people using blatant lies: 100 percent.

We shall destroy you now.

Prepare for annihilation."</Text>
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
              <enemyType>Torvak</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Fight them!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_H_S_Radio Message</Name>
</Scenario>