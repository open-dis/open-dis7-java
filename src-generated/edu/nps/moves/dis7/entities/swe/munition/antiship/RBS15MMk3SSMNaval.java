package edu.nps.moves.dis7.entities.swe.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ba4f370
 * Country: Sweden (SWE)
 * Entity kind: Munition
 * Domain: ANTI_SHIP
 *
 * Entity type uid: 27307
 */
public class RBS15MMk3SSMNaval extends EntityType
{
    public RBS15MMk3SSMNaval()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 27301, Guided
        setSubCategory((byte)1); // uid 27302, RBS-15 (SSM/ASM)
        setSpecific((byte)5); // uid 27307, RBS-15M Mk3 (SSM Naval)
    }
}
