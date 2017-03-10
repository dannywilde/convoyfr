<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/ObjectiveScenarios/Q_CompressionCoil_BarryReturn2.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>163</x>
        <y>353</y>
        <center>
          <x>269</x>
          <y>404.5</y>
        </center>
        <width>212</width>
        <height>103</height>
        <xMin>163</xMin>
        <yMin>353</yMin>
        <xMax>375</xMax>
        <yMax>456</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You return to Shanty Sands and drop Barry off at his home.
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
                <x>200</x>
                <y>65</y>
                <center>
                  <x>205</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>200</xMin>
                <yMin>65</yMin>
                <xMax>210</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>So, about those coordinates?</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>238</x>
        <y>665</y>
        <center>
          <x>313</x>
          <y>715</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>238</xMin>
        <yMin>665</yMin>
        <xMax>388</xMax>
        <yMax>765</yMax>
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
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Take loot</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>475</x>
        <y>300</y>
        <center>
          <x>572</x>
          <y>350</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>475</xMin>
        <yMin>300</yMin>
        <xMax>669</xMax>
        <yMax>400</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Barry enters the coordinates to a Compression Coil facility to your map.

"Assault that facility and you should be able to find a Compression Coil.

If you don't manage to find a functioning one, look for cargo crates marked with an orange and black helix-shaped symbol. 

I'll be able to construct a functioning one for you with those materials."</Text>
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
              <nodeName>Q_CompressionCoil_BarryHome</nodeName>
              <nodeDiscription>Barry has given you the location of a Compression Coil facility, you should destroy it and look for a Compression Coil or cargo crates marked with an orange and black helix-shaped symbol. </nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Thanks.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_CompressionCoil_BarryReturn2</Name>
</Scenario>