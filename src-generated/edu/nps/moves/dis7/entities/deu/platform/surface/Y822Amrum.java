package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f19ac19;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16663
 */
public class Y822Amrum extends EntityType
{
    /** Default constructor */
    public Y822Amrum()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 16659, Auxiliary, Merchant Marine
        setSubCategory((byte)1); // uid 16660, Sylt Class (Type 724)
        setSpecific((byte)3); // uid 16663, Y 822 Amrum
    }
}
