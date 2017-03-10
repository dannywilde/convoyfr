<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveName>Blue R998X Chip</objectiveName>
  <objectiveDiscription>According to your intel, the only Blue R998X Chip on all of Omek Prime is in the hands of James Faye, a notorious raider warchief known to command legions of grunts.

Negotiation is out of the question. Your only option is to attack him and fight through numerous waves of grunts before facing his massive engine of destruction.</objectiveDiscription>
  <objectiveMainDiscription>The Blue R998X Chip has malfunctioned after your unfortunate landing on Omek Prime.

Essential to the FluffOS which runs most of your primary spaceship systems, it is imperative to get it replaced.

After inquiring, it seems the only known location of a functional Blue R998X Chip is inside the monstrous vehicle used by the notorious raider warchief James Faye.

He is not known to negotiate, ever. He takes what he wants, by force.

Negotiation is out of the question. Your only option is to attack him and fight through numerous waves of grunts before facing his massive engine of destruction.</objectiveMainDiscription>
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_M_S_Bluechip.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>86</x>
        <y>268</y>
        <position>
          <x>86</x>
          <y>268</y>
        </position>
        <center>
          <x>183</x>
          <y>332.5</y>
        </center>
        <min>
          <x>86</x>
          <y>268</y>
        </min>
        <max>
          <x>280</x>
          <y>397</y>
        </max>
        <width>194</width>
        <height>129</height>
        <size>
          <x>194</x>
          <y>129</y>
        </size>
        <xMin>86</xMin>
        <yMin>268</yMin>
        <xMax>280</xMax>
        <yMax>397</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Judging from the tracks of destruction left in the wake of numerous vehicles, you can only assume you are near the James Faye warband.

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
              <distance>1</distance>
            </ButtonAction>
          </Actions>
          <Name>Come back later.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>121</x>
        <y>667</y>
        <position>
          <x>121</x>
          <y>667</y>
        </position>
        <center>
          <x>218</x>
          <y>717.5</y>
        </center>
        <min>
          <x>121</x>
          <y>667</y>
        </min>
        <max>
          <x>315</x>
          <y>768</y>
        </max>
        <width>194</width>
        <height>101</height>
        <size>
          <x>194</x>
          <y>101</y>
        </size>
        <xMin>121</xMin>
        <yMin>667</yMin>
        <xMax>315</xMax>
        <yMax>768</yMax>
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
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>83</y>
                <position>
                  <x>182</x>
                  <y>83</y>
                </position>
                <center>
                  <x>187</x>
                  <y>88</y>
                </center>
                <min>
                  <x>182</x>
                  <y>83</y>
                </min>
                <max>
                  <x>192</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>83</yMin>
                <xMax>192</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Bluechip_Miniboss</nodeName>
              <nodeDiscription>According to your intel, the only Blue R998X Chip on all of Omek Prime is in the hands of James Faye, a notorious raider warchief known to command legions of grunts.

You've defeated the first wave of attackers and James Faye himself is inbound!</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>Q_M_S_Bluechip</posSameAs>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Phew...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>378</x>
        <y>234</y>
        <position>
          <x>378</x>
          <y>234</y>
        </position>
        <center>
          <x>453</x>
          <y>284</y>
        </center>
        <min>
          <x>378</x>
          <y>234</y>
        </min>
        <max>
          <x>528</x>
          <y>334</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>378</xMin>
        <yMin>234</yMin>
        <xMax>528</xMax>
        <yMax>334</yMax>
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
              <difficulty>-5</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Let's rock!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_M_S_Bluechip</Name>
</Scenario>