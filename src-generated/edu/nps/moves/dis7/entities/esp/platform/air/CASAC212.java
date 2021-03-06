package edu.nps.moves.dis7.entities.esp.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5ba26eb0;
 * Country: Spain (ESP);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 19000
 */
public class CASAC212 extends EntityType
{
    /** Default constructor */
    public CASAC212()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 18999, Cargo/Tanker
        setSubCategory((byte)1); // uid 19000, CASA C-212
    }
}
