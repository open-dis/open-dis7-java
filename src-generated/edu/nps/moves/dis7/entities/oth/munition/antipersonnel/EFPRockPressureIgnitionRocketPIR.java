package edu.nps.moves.dis7.entities.oth.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1eb9bf60;
 * Country: Other;
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 26352
 */
public class EFPRockPressureIgnitionRocketPIR extends EntityType
{
    /** Default constructor */
    public EFPRockPressureIgnitionRocketPIR()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)3); // uid 21697, Fixed
        setSubCategory((byte)2); // uid 26180, Explosively Formed Penetrator (EFP)
        setSpecific((byte)2); // uid 26352, EFP, Rock Pressure Ignition Rocket (PIR)
    }
}
