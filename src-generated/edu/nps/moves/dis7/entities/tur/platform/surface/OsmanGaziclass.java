package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2630dbc4;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23283
 */
public class OsmanGaziclass extends EntityType
{
    /** Default constructor */
    public OsmanGaziclass()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 23276, Tank Landing Ship
        setSubCategory((byte)3); // uid 23283, Osman Gazi class
    }
}
