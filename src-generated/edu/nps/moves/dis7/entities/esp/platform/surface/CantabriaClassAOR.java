package edu.nps.moves.dis7.entities.esp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@317e9c3c;
 * Country: Spain (ESP);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32936
 */
public class CantabriaClassAOR extends EntityType
{
    /** Default constructor */
    public CantabriaClassAOR()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 19026, Auxiliary
        setSubCategory((byte)3); // uid 32936, Cantabria Class (AOR)
    }
}
