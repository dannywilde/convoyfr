<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_Multi_DonnieTorvak2.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>316</x>
        <y>352</y>
        <position>
          <x>316</x>
          <y>352</y>
        </position>
        <center>
          <x>391.5</x>
          <y>402</y>
        </center>
        <min>
          <x>316</x>
          <y>352</y>
        </min>
        <max>
          <x>467</x>
          <y>452</y>
        </max>
        <width>151</width>
        <height>100</height>
        <size>
          <x>151</x>
          <y>100</y>
        </size>
        <xMin>316</xMin>
        <yMin>352</yMin>
        <xMax>467</xMax>
        <yMax>452</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Upon returning to Rinus' laboratory and heading inside, you discover he has already made great progress.

Rinus and Donnie greet each other and quickly start discussing the project.

Eventually, they turn towards you.</Text>
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
                <position>
                  <x>139</x>
                  <y>65</y>
                </position>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <min>
                  <x>139</x>
                  <y>65</y>
                </min>
                <max>
                  <x>149</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Let's hear it.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>445</x>
        <y>685</y>
        <position>
          <x>445</x>
          <y>685</y>
        </position>
        <center>
          <x>520</x>
          <y>735</y>
        </center>
        <min>
          <x>445</x>
          <y>685</y>
        </min>
        <max>
          <x>595</x>
          <y>785</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>445</xMin>
        <yMin>685</yMin>
        <xMax>595</xMax>
        <yMax>785</yMax>
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
        <x>570</x>
        <y>294</y>
        <position>
          <x>570</x>
          <y>294</y>
        </position>
        <center>
          <x>667</x>
          <y>358.5</y>
        </center>
        <min>
          <x>570</x>
          <y>294</y>
        </min>
        <max>
          <x>764</x>
          <y>423</y>
        </max>
        <width>194</width>
        <height>129</height>
        <size>
          <x>194</x>
          <y>129</y>
        </size>
        <xMin>570</xMin>
        <yMin>294</yMin>
        <xMax>764</xMax>
        <yMax>423</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Okay, we're going to rig up my vats of infused ethanol to pass through Donnie's Rintaro Microwave.

If all goes well, what passes through will have endured decades worth of time to properly absorb the organic matter, resulting in the most creative way to synthesize Multicellulose Infused Ethanol ever!

It's either that, or when it collapses in on itself it'll destroy the entire universe as we know it. Only we wouldn't know it, because it never would have existed, so nothing to really worry about.

It's going to take some time for your required amount to all pass through the machine, so you'll have to return at a later time."</Text>
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
              <nodeName>Q_Multi_DonnieTorvak3</nodeName>
              <nodeDiscription>The Multicellulose Infused Ethanol needs time to process.

You should return to Rinus' laboratory at a later time to see if it's finished.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>Will do.</Name>
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
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>How long will it take?</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>824</x>
        <y>406</y>
        <position>
          <x>824</x>
          <y>406</y>
        </position>
        <center>
          <x>921</x>
          <y>456</y>
        </center>
        <min>
          <x>824</x>
          <y>406</y>
        </min>
        <max>
          <x>1018</x>
          <y>506</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>824</xMin>
        <yMin>406</yMin>
        <xMax>1018</xMax>
        <yMax>506</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Well, difficult to say. Technically decades will have passed, but its hard to say how many decades we can cram in a short timeframe.

We're testing the limits of the Rintaro Microwave as we're doing this, so we can't really give any guideline other than 'When it's ready.'

So yeah, come back later and we'll see if we're done."</Text>
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
              <nodeName>Q_Multi_DonnieTorvak3</nodeName>
              <nodeDiscription>The Multicellulose Infused Ethanol needs time to process.

You should return to Rinus' laboratory at a later time to see if it's finished.</nodeDiscription>
              <pos>Distance</pos>
              <distance>1</distance>
            </ButtonAction>
          </Actions>
          <Name>Alright then.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Multi_DonnieTorvak2</Name>
</Scenario>