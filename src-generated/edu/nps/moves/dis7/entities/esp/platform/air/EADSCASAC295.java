package edu.nps.moves.dis7.entities.esp.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@435e60ff;
 * Country: Spain (ESP);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24758
 */
public class EADSCASAC295 extends EntityType
{
    /** Default constructor */
    public EADSCASAC295()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 18999, Cargo/Tanker
        setSubCategory((byte)2); // uid 24758, EADS CASA C-295
    }
}
