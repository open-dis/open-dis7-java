package edu.nps.moves.dis7.entities.ukr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1e1e9ef3
 * Country: Ukraine (UKR)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 29232
 */
public class AntonovAn72P extends EntityType
{
    public AntonovAn72P()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 29230, Cargo/Tanker
        setSubCategory((byte)2); // uid 29232, Antonov An-72P
    }
}
