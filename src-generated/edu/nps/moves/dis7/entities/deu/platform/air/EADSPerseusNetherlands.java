package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@43599640
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 28209
 */
public class EADSPerseusNetherlands extends EntityType
{
    public EADSPerseusNetherlands()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 22773, Unmanned
        setSubCategory((byte)9); // uid 28192, EADS Perseus
        setSpecific((byte)1); // uid 28209, EADS Perseus (Netherlands)
    }
}
