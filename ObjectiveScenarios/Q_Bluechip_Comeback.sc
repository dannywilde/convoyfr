<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveName>Blue R998X Chip</objectiveName>
  <objectiveDiscription>According to your intel, the only Blue R998X Chip on all of Omek Prime is in the hands of James Faye, a notorious raider warchief known to command legions of grunts.

Negotiation is out of the question, your only option is to attack him, fight through numerous waves of grunts before facing his massive engine of destruction.</objectiveDiscription>
  <objectiveMainDiscription />
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/projects/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_Bluechip_Comeback.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>114</x>
        <y>218</y>
        <position>
          <x>114</x>
          <y>218</y>
        </position>
        <center>
          <x>211</x>
          <y>282.5</y>
        </center>
        <min>
          <x>114</x>
          <y>218</y>
        </min>
        <max>
          <x>308</x>
          <y>347</y>
        </max>
        <width>194</width>
        <height>129</height>
        <size>
          <x>194</x>
          <y>129</y>
        </size>
        <xMin>114</xMin>
        <yMin>218</yMin>
        <xMax>308</xMax>
        <yMax>347</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Judging from the tracks of destruction left in the wake of numerous vehicles, you can only assume you are near James Faye warband.

The only upside to the warband is that it moves quite slowly, giving you ample time to catch up.

If you have more preperations to do, now is the time.</Text>
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
                <x>182</x>
                <y>65</y>
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>We're ready, let's do this.</Name>
        </DialogButton>
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
                <y>109</y>
                <position>
                  <x>182</x>
                  <y>109</y>
                </position>
                <center>
                  <x>187</x>
                  <y>114</y>
                </center>
                <min>
                  <x>182</x>
                  <y>109</y>
                </min>
                <max>
                  <x>192</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>109</yMin>
                <xMax>192</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Bluechip_Comeback</nodeName>
              <nodeDiscription>According to your intel, the only Blue R998X Chip on all of Omek Prime is in the hands of James Faye, a notorious raider warchief known to command legions of grunts.

Negotiation is out of the question, your only option is to attack him, fight through numerous waves of grunts before facing his massive engine of destruction.</nodeDiscription>
              <pos>Distance</pos>
              <posSameAs>Q_M_S_Bluechip</posSameAs>
              <distance>1</distance>
            </ButtonAction>
          </Actions>
          <Name>Come back later.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>148</x>
        <y>617</y>
        <position>
          <x>148</x>
          <y>617</y>
        </position>
        <center>
          <x>245</x>
          <y>667</y>
        </center>
        <min>
          <x>148</x>
          <y>617</y>
        </min>
        <max>
          <x>342</x>
          <y>717</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>148</xMin>
        <yMin>617</yMin>
        <xMax>342</xMax>
        <yMax>717</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>You've succesfully defeated the first wave of attackers.</Text>
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Bluechip_Wave2</nodeName>
              <nodeDiscription>According to your intel, the only Blue R998X Chip on all of Omek Prime is in the hands of James Faye, a notorious raider warchief known to command legions of grunts.

You've defeated the first wave of attackers, get ready for wave two!</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>Q_M_S_Bluechip</posSameAs>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>Phew...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>406</x>
        <y>183</y>
        <position>
          <x>406</x>
          <y>183</y>
        </position>
        <center>
          <x>481</x>
          <y>233</y>
        </center>
        <min>
          <x>406</x>
          <y>183</y>
        </min>
        <max>
          <x>556</x>
          <y>283</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>406</xMin>
        <yMin>183</yMin>
        <xMax>556</xMax>
        <yMax>283</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You pursue the warband and it doen't take long for the first vehicles to detach and attack your convoy.</Text>
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
          <Name>Let's rock!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Bluechip_Comeback</Name>
</Scenario>