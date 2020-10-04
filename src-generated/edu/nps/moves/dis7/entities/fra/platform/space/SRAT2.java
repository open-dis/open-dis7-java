package edu.nps.moves.dis7.entities.fra.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2d0399f4
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: SPACE
 *
 * Entity type uid: 16234
 */
public class SRAT2 extends EntityType
{
    public SRAT2()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16211, Unmanned
        setSubCategory((byte)13); // uid 16229, Science satellite
        setSpecific((byte)5); // uid 16234, SRAT 2
    }
}
